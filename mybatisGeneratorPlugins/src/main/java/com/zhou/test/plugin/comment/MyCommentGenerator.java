package com.zhou.test.plugin.comment;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.MergeConstants;
import org.mybatis.generator.internal.DefaultCommentGenerator;

/**
 * @author 01384526
 * @title: MyCommentGenerator
 * @projectName zhousecurity
 * @description: TODO
 * @date 2019/5/3119:48
 */
public class MyCommentGenerator extends DefaultCommentGenerator {
    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
        // 类注释，不管用
        String shortName = innerClass.getType().getShortName();
        innerClass.addJavaDocLine("/**");
        innerClass.addJavaDocLine(" * 类注释");
        innerClass.addJavaDocLine(" * " + shortName);
        innerClass.addJavaDocLine(" * 数据库表：" + introspectedTable.getFullyQualifiedTable());
        // addJavadocTag(innerClass, false);
        innerClass.addJavaDocLine(" */");
    }

    @Override
    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
        // 类注释，不管用
        String shortName = innerClass.getType().getShortName();
        innerClass.addJavaDocLine("/**");
        innerClass.addJavaDocLine(" * 类注释");
        innerClass.addJavaDocLine(" * " + shortName);
        innerClass.addJavaDocLine(" * 数据库表：" + introspectedTable.getFullyQualifiedTable());
        // addJavadocTag(innerClass, false);
        innerClass.addJavaDocLine(" */");
    }

    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        // 添加字段注释
        StringBuffer sb = new StringBuffer();
        field.addJavaDocLine("/**");
        field.addJavaDocLine(" * <pre>");
        if (introspectedColumn.getRemarks() != null){
            String s=introspectedColumn.getRemarks();

            field.addJavaDocLine(" * " + s);
        }
        sb.append(" * 表字段 : ");
        sb.append(introspectedTable.getFullyQualifiedTable());
        sb.append('.');
        sb.append(introspectedColumn.getActualColumnName());
        field.addJavaDocLine(sb.toString());
        field.addJavaDocLine(" * </pre>");
        // addJavadocTag(field, false);
        field.addJavaDocLine(" */");
    }

    @Override
    public void addComment(XmlElement xmlElement) {
        xmlElement.addElement(new TextElement("<!--")); //$NON-NLS-1$

        StringBuilder sb = new StringBuilder();
        sb.append(MergeConstants.NEW_ELEMENT_TAG);
        xmlElement.addElement(new TextElement(sb.toString()));
//        xmlElement
//                .addElement(new TextElement(
//                        "  This element is automatically generated by MyBatis Generator, do not modify.")); //$NON-NLS-1$

//        String s = getDateString();
//        if (s != null) {
//            sb.setLength(0);
//            sb.append("  This element was generated on "); //$NON-NLS-1$
//            sb.append(s);
//            sb.append('.');
//            xmlElement.addElement(new TextElement(sb.toString()));
//        }

        xmlElement.addElement(new TextElement("-->")); //$NON-NLS-1$
    }
}
