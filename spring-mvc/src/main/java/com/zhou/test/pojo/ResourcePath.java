package com.zhou.test.pojo;

public class ResourcePath {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_path.resource_id
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    private String resourceId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_path.resource_name
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    private String resourceName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_path.resource_path
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    private String resourcePath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_path.req_method
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    private String reqMethod;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_path.remark
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    private String remark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resource_path.type
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    private Byte type;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_path.resource_id
     *
     * @return the value of resource_path.resource_id
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public String getResourceId() {
        return resourceId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_path.resource_id
     *
     * @param resourceId the value for resource_path.resource_id
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_path.resource_name
     *
     * @return the value of resource_path.resource_name
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_path.resource_name
     *
     * @param resourceName the value for resource_path.resource_name
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_path.resource_path
     *
     * @return the value of resource_path.resource_path
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public String getResourcePath() {
        return resourcePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_path.resource_path
     *
     * @param resourcePath the value for resource_path.resource_path
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath == null ? null : resourcePath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_path.req_method
     *
     * @return the value of resource_path.req_method
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public String getReqMethod() {
        return reqMethod;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_path.req_method
     *
     * @param reqMethod the value for resource_path.req_method
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public void setReqMethod(String reqMethod) {
        this.reqMethod = reqMethod == null ? null : reqMethod.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_path.remark
     *
     * @return the value of resource_path.remark
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_path.remark
     *
     * @param remark the value for resource_path.remark
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resource_path.type
     *
     * @return the value of resource_path.type
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public Byte getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resource_path.type
     *
     * @param type the value for resource_path.type
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    public void setType(Byte type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_path
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
        ResourcePath other = (ResourcePath) that;
        return (this.getResourceId() == null ? other.getResourceId() == null : this.getResourceId().equals(other.getResourceId()))
            && (this.getResourceName() == null ? other.getResourceName() == null : this.getResourceName().equals(other.getResourceName()))
            && (this.getResourcePath() == null ? other.getResourcePath() == null : this.getResourcePath().equals(other.getResourcePath()))
            && (this.getReqMethod() == null ? other.getReqMethod() == null : this.getReqMethod().equals(other.getReqMethod()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_path
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        result = prime * result + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        result = prime * result + ((getResourcePath() == null) ? 0 : getResourcePath().hashCode());
        result = prime * result + ((getReqMethod() == null) ? 0 : getReqMethod().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table resource_path
     *
     * @mbg.generated Fri Jul 05 19:09:18 CST 2019
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", resourceId=").append(resourceId);
        sb.append(", resourceName=").append(resourceName);
        sb.append(", resourcePath=").append(resourcePath);
        sb.append(", reqMethod=").append(reqMethod);
        sb.append(", remark=").append(remark);
        sb.append(", type=").append(type);
        sb.append("]");
        return sb.toString();
    }
}