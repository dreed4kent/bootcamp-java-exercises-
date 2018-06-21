-- The following queries utilize the "world" database.
-- Write queries for the following problems. 
-- Notes:
--   GNP is expressed in units of one million US Dollars
--   The value immediately after the problem statement is the expected number 
--   of rows that should be returned by the query.

-- 1. The name and state plus population of all cities in states that border Ohio 
-- (i.e. cities located in Pennsylvania, West Virginia, Kentucky, Indiana, and 
-- Michigan).  
-- The name and state should be returned as a single column called 
-- name_and_state and should contain values such as ‘Detroit, Michigan’.  
-- The results should be ordered alphabetically by state name and then by city 
-- name. 
-- (19 rows)
select (name || ', ' || district) AS name_and_state, population from city
where district IN ('Pennsylvania', 'West Virginia', 'Kentucky', 'Indiana', 'Michigan')
ORDER BY district, name;

-- 2. The name, country code, and region of all countries in Africa.  The name and
-- country code should be returned as a single column named country_and_code 
-- and should contain values such as ‘Angola (AGO)’ 
-- (58 rows)
select (name || ' (' || code || ')') AS country_and_code from country
WHERE continent = 'Africa'

-- 3. The per capita GNP (i.e. GNP multipled by 1000000 then divided by population) of all countries in the 
-- world sorted from highest to lowest. Recall: GNP is express in units of one million US Dollars 
-- (highest per capita GNP in world: 37459.26)
select ROUND(MAX(gnp * 1000000 / population), 2) AS per_capita_gnp FROM country
WHERE population > 0
ORDER BY per_capita_gnp DESC

-- 4. The average life expectancy of countries in South America.
-- (average life expectancy in South America: 70.9461)
select ROUND(AVG(lifeexpectancy::decimal), 4) AS avg_life_expectancy_South_America from country
WHERE continent = 'South America'

-- 5. The sum of the population of all cities in California.
-- (total population of all cities in California: 16716706)
select (SUM(population)) from city
WHERE district = 'California'

-- 6. The sum of the population of all cities in China.
-- (total population of all cities in China: 175953614)
select (SUM(population)) from city
WHERE countrycode = 'CHN'

-- 7. The maximum population of all countries in the world.
-- (largest country population in world: 1277558000)
select MAX(population) from country

-- 8. The maximum population of all cities in the world.
-- (largest city population in world: 10500000)
select MAX(population) from city

-- 9. The maximum population of all cities in Australia.
-- (largest city population in Australia: 3276207)
select MAX(population) from city
WHERE countrycode = 'AUS'

-- 10. The minimum population of all countries in the world.
-- (smallest_country_population in world: 50)
select MIN(population) AS smallest_country_population from country
WHERE population > 0

-- 11. The average population of cities in the United States.
-- (avgerage city population in USA: 286955.3795)
select ROUND(AVG(population), 4) from city
WHERE countrycode = 'USA'

-- 12. The average population of cities in China.
-- (average city population in China: 484720.6997 approx.)
select ROUND(AVG(population), 4) from city
WHERE countrycode = 'CHN'

-- 13. The surface area of each continent ordered from highest to lowest.
-- (largest continental surface area: 31881000, "Asia")
select SUM(surfacearea), continent from country
GROUP BY continent

-- 14. The highest population density (population divided by surface area) of all 
-- countries in the world. 
-- (highest population density in world: 26277.7777)
select name, ROUND((population / surfacearea)::decimal, 4) AS population_density from country
ORDER BY population_density DESC

-- 15. The population density and life expectancy of the top ten countries with the 
-- highest life expectancies in descending order. 
-- (highest life expectancies in world: 83.5, 166.6666, "Andorra")
select name, ROUND((population / surfacearea)::decimal, 4) AS population_density, lifeexpectancy from country
WHERE lifeexpectancy is not null
ORDER BY lifeexpectancy DESC
LIMIT 10

-- 16. The difference between the previous and current GNP of all the countries in 
-- the world ordered by the absolute value of the difference. Display both 
-- difference and absolute difference.
-- (smallest difference: 1.00, 1.00, "Ecuador")
select name, (gnp - gnpold) AS new_and_old_gnp, ABS(gnp - gnpold) AS abs_gnp from country
WHERE gnpold is not null
ORDER BY abs_gnp ASC

-- 17. The average population of cities in each country (hint: use city.countrycode)
-- ordered from highest to lowest.
-- (highest avg population: 4017733.0000, "SGP")
select countrycode, ROUND(AVG(population)::decimal, 4) AS avg_population from city
GROUP BY countrycode
ORDER BY avg_population DESC
	
-- 18. The count of cities in each state in the USA, ordered by state name.
-- (45 rows)
select district AS state, COUNT(name) AS number_of_cities from city
WHERE countrycode = 'USA'
GROUP BY district
ORDER BY district
	
-- 19. The count of countries on each continent, ordered from highest to lowest.
-- (highest count: 58, "Africa")
select continent, COUNT(name) AS number_of_countries from country
GROUP BY continent
ORDER BY number_of_countries DESC
	
-- 20. The count of cities in each country ordered from highest to lowest.
-- (largest number of  cities ib a country: 363, "CHN")
select countrycode AS country, COUNT(name) AS number_of_cities from city
GROUP BY countrycode
ORDER BY number_of_cities DESC

-- 21. The population of the largest city in each country ordered from highest to 
-- lowest.
-- (largest city population in world: 10500000, "IND")
select countrycode, MAX(population) AS max_population from city
GROUP BY countrycode
ORDER BY max_population DESC

-- 22. The average, minimum, and maximum non-null life expectancy of each continent 
-- ordered from lowest to highest average life expectancy. 
-- (lowest average life expectancy: 52.5719, 37.2, 76.8, "Africa")
select continent, AVG(lifeexpectancy), MIN(lifeexpectancy), MAX(lifeexpectancy) from country
WHERE lifeexpectancy is not null
GROUP BY continent
