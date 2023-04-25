package com.dk.jpa_test.repository;

import com.dk.jpa_test.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserRepository extends JpaRepository<User, String>, JpaSpecificationExecutor<User> {
    @Query(value = "select id,name,create_time,update_time,`count` from User where id in(select id from User order by id desc) limit ?1,?2",
            nativeQuery = true)
//            countQuery = "select count(1) from User where id in(select id from User order by id desc)")
//            , countQuery = "select count(select id,name,create_time,update_time from User where id in(select id from User order by id desc))")
//    @Query(value = "select User from User where id in (select id from User order by id desc )")
    List<User> getUsers(Integer pageNo, Integer pageSize);

//    @Query(value = "select id,name,create_time,update_time,`count` from User where id in(select id from User order by id desc) order by ?#{#pageable} ",
//            nativeQuery = true,
//            countQuery = "select count(select id,name,create_time,update_time from User where id in(select id from User order by id desc)) ")
////    Page<List<User>> getUsers(Pageable pageable);
//    Page<User> getUsers(Pageable pageable);

    @Query(value = "select id,name,create_time,update_time,`count` from User where id in(select id from User order by id desc) ",
            nativeQuery = true)
    List<Map<String, String>> getUsers();


    @Query(value = "select User from User where id in(select id from User order by id desc) ")
    Page<User> getUsers(Pageable pageable);
}
