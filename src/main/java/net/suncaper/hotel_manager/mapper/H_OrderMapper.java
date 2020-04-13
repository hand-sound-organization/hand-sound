package net.suncaper.hotel_manager.mapper;

import java.util.List;
import net.suncaper.hotel_manager.domain.H_Order;
import net.suncaper.hotel_manager.domain.H_OrderExample;
import org.apache.ibatis.annotations.Param;

public interface H_OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    long countByExample(H_OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    int deleteByExample(H_OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    int deleteByPrimaryKey(Integer oId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    int insert(H_Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    int insertSelective(H_Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    List<H_Order> selectByExample(H_OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    H_Order selectByPrimaryKey(Integer oId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    int updateByExampleSelective(@Param("record") H_Order record, @Param("example") H_OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    int updateByExample(@Param("record") H_Order record, @Param("example") H_OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    int updateByPrimaryKeySelective(H_Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table h_order
     *
     * @mbg.generated Wed Aug 07 17:59:24 CST 2019
     */
    int updateByPrimaryKey(H_Order record);
}