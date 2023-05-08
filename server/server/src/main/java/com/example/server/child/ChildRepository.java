package com.example.server.child;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChildRepository extends JpaRepository<Child, Integer> {


    // temp

   // @Query(value = "select T.temperature temp, M.tag_name tagName FROM tag_master M, (with cte as (select t.* , row_number() over (partition by tag_id order by timestamp desc) rn from motor t) select tag_id,temperature,timestamp from cte where rn=1) T where M.tag_id= T.tag_id", nativeQuery = true)


 @Query("SELECT " +
         "  new com.example.server.child.ChildResult(c.id, p.sender, p.receiver, p.totalAmount, c.paidAmount) " +
         "FROM " +
         "child c " +
         "JOIN " +
         "c.parent p " +
         "WHERE " +
         "p.id = :id")
    List<ChildResult> findChild(Integer id);
}
