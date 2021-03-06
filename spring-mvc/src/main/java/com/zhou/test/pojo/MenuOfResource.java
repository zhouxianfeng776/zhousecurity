package com.zhou.test.pojo;

public class MenuOfResource {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_of_resource.id
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_of_resource.menu_id
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    private String menuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column menu_of_resource.resource_id
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    private String resourceId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_of_resource.id
     *
     * @return the value of menu_of_resource.id
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_of_resource.id
     *
     * @param id the value for menu_of_resource.id
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_of_resource.menu_id
     *
     * @return the value of menu_of_resource.menu_id
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public String getMenuId() {
        return menuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_of_resource.menu_id
     *
     * @param menuId the value for menu_of_resource.menu_id
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public void setMenuId(String menuId) {
        this.menuId = menuId == null ? null : menuId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column menu_of_resource.resource_id
     *
     * @return the value of menu_of_resource.resource_id
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column menu_of_resource.resource_id
     *
     * @param resourceId the value for menu_of_resource.resource_id
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_of_resource
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
        MenuOfResource other = (MenuOfResource) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMenuId() == null ? other.getMenuId() == null : this.getMenuId().equals(other.getMenuId()))
            && (this.getResourceId() == null ? other.getResourceId() == null : this.getResourceId().equals(other.getResourceId()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_of_resource
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMenuId() == null) ? 0 : getMenuId().hashCode());
        result = prime * result + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table menu_of_resource
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", menuId=").append(menuId);
        sb.append(", resourceId=").append(resourceId);
        sb.append("]");
        return sb.toString();
    }
}