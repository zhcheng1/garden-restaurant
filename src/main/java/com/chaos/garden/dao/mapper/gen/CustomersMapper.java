package com.chaos.garden.dao.mapper.gen;

import com.chaos.garden.model.gen.Customers;
import com.chaos.garden.model.gen.CustomersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomersMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbggenerated Sat Jun 18 16:22:01 CST 2016
     */
    int countByExample(CustomersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbggenerated Sat Jun 18 16:22:01 CST 2016
     */
    int deleteByExample(CustomersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbggenerated Sat Jun 18 16:22:01 CST 2016
     */
    int deleteByPrimaryKey(Integer customerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbggenerated Sat Jun 18 16:22:01 CST 2016
     */
    int insert(Customers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbggenerated Sat Jun 18 16:22:01 CST 2016
     */
    int insertSelective(Customers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbggenerated Sat Jun 18 16:22:01 CST 2016
     */
    List<Customers> selectByExampleWithBLOBs(CustomersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbggenerated Sat Jun 18 16:22:01 CST 2016
     */
    List<Customers> selectByExample(CustomersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbggenerated Sat Jun 18 16:22:01 CST 2016
     */
    Customers selectByPrimaryKey(Integer customerId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbggenerated Sat Jun 18 16:22:01 CST 2016
     */
    int updateByExampleSelective(@Param("record") Customers record, @Param("example") CustomersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbggenerated Sat Jun 18 16:22:01 CST 2016
     */
    int updateByExampleWithBLOBs(@Param("record") Customers record, @Param("example") CustomersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbggenerated Sat Jun 18 16:22:01 CST 2016
     */
    int updateByExample(@Param("record") Customers record, @Param("example") CustomersExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbggenerated Sat Jun 18 16:22:01 CST 2016
     */
    int updateByPrimaryKeySelective(Customers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbggenerated Sat Jun 18 16:22:01 CST 2016
     */
    int updateByPrimaryKeyWithBLOBs(Customers record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customers
     *
     * @mbggenerated Sat Jun 18 16:22:01 CST 2016
     */
    int updateByPrimaryKey(Customers record);
}