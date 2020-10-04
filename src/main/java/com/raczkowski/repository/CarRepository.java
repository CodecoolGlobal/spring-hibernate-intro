package com.raczkowski.repository;

import com.raczkowski.entity.manytomany.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface CarRepository extends CrudRepository<Car, Long> {

    /**
     * Equality condition keywords
     */

    /**
     * Exact match
     */
    List<Car> findByName(String name);

    List<Car> findByNameIs(String name);

    List<Car> findByNameEquals(String name);

    List<Car> findByNameIsNot(String name);


    /**
     * Similarity condition keywords
     */

    List<Car> findByNameStartingWith(String prefix);

    List<Car> findByNameEndsWith(String suffix);

    List<Car> findByNameContaining(String infix);

    /**
     * More complex, pattern e.g. "a%b%c"
     */
    List<Car> findByNameLike(String likePattern);

    /**
     * Comparison condition keywords
     */
    List<Car> findByPriceLessThan(Integer price);

    List<Car> findByPriceLessThanEqual(Integer price);

    List<Car> findByPriceGreaterThan(Integer price);

    List<Car> findByPriceGreaterThanEqual(Integer price);

    List<Car> findByPriceBetween(Integer start, Integer end);

    List<Car> findByPriceIn(Collection<Integer> prices);

    /**
     * Multiple condition expressions
     */
    List<Car> findByNameOrPrice(String name, Integer price);

    /**
     * Sorting result
     */
    List<Car> findByNameOrderByNameAsc(String name);

    /**
     * Custom
     */
    @Query("select c from Car c where c.name='Bmw'")
    List<Car> findOnlyBmw();

    @Query(value = "select * from CAR WHERE NAME='Volvo'",
            nativeQuery = true)
    List<Car> findOnlyVolvo();


}
