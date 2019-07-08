package com.zhou.test.pojo;

public class Menu {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.menu_id
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    private String menuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.parent_id
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    private String parentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.menu_name
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    private String menuName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.menu_url
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    private String menuUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.menu_type
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    private Byte menuType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.remark
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu.order_number
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    private Integer orderNumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.menu_id
     *
     * @return the value of menu.menu_id
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.menu_id
     *
     * @param menuId the value for menu.menu_id
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.parent_id
     *
     * @return the value of menu.parent_id
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.parent_id
     *
     * @param parentId the value for menu.parent_id
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.menu_name
     *
     * @return the value of menu.menu_name
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public String getMenuName() {
        return menuName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.menu_name
     *
     * @param menuName the value for menu.menu_name
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.menu_url
     *
     * @return the value of menu.menu_url
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.menu_url
     *
     * @param menuUrl the value for menu.menu_url
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl == null ? null : menuUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.menu_type
     *
     * @return the value of menu.menu_type
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public Byte getMenuType() {
        return menuType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.menu_type
     *
     * @param menuType the value for menu.menu_type
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public void setMenuType(Byte menuType) {
        this.menuType = menuType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.remark
     *
     * @return the value of menu.remark
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.remark
     *
     * @param remark the value for menu.remark
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu.order_number
     *
     * @return the value of menu.order_number
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public Integer getOrderNumber() {
        return orderNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu.order_number
     *
     * @param orderNumber the value for menu.order_number
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Menu other = (Menu) that;
        return (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
            && (this.getParentId() == null ? other.getParentId() == null : this.getParentId().equals(other.getParentId()))
            && (this.getMenuName() == null ? other.getMenuName() == null : this.getMenuName().equals(other.getMenuName()))
            && (this.getMenuUrl() == null ? other.getMenuUrl() == null : this.getMenuUrl().equals(other.getMenuUrl()))
            && (this.getMenuType() == null ? other.getMenuType() == null : this.getMenuType().equals(other.getMenuType()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getOrderNumber() == null ? other.getOrderNumber() == null : this.getOrderNumber().equals(other.getOrderNumber()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        result = prime * result + ((getParentId() == null) ? 0 : getParentId().hashCode());
        result = prime * result + ((getMenuName() == null) ? 0 : getMenuName().hashCode());
        result = prime * result + ((getMenuUrl() == null) ? 0 : getMenuUrl().hashCode());
        result = prime * result + ((getMenuType() == null) ? 0 : getMenuType().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getOrderNumber() == null) ? 0 : getOrderNumber().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", menuId=").append(menuId);
        sb.append(", parentId=").append(parentId);
        sb.append(", menuName=").append(menuName);
        sb.append(", menuUrl=").append(menuUrl);
        sb.append(", menuType=").append(menuType);
        sb.append(", remark=").append(remark);
        sb.append(", orderNumber=").append(orderNumber);
        sb.append("]");
        return sb.toString();
    }
}