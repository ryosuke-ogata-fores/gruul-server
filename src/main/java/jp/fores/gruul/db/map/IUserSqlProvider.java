package jp.fores.gruul.db.map;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import java.util.List;
import java.util.Map;
import jp.fores.gruul.db.entity.IUser;
import jp.fores.gruul.db.entity.IUserExample.Criteria;
import jp.fores.gruul.db.entity.IUserExample.Criterion;
import jp.fores.gruul.db.entity.IUserExample;

public class IUserSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_user
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    public String countByExample(IUserExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("i_user");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_user
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    public String deleteByExample(IUserExample example) {
        BEGIN();
        DELETE_FROM("i_user");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_user
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    public String insertSelective(IUser record) {
        BEGIN();
        INSERT_INTO("i_user");
        
        if (record.getId() != null) {
            VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getUuid() != null) {
            VALUES("uuid", "#{uuid,jdbcType=VARCHAR}");
        }
        
        if (record.getNickname() != null) {
            VALUES("nickname", "#{nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getIconId() != null) {
            VALUES("icon_id", "#{iconId,jdbcType=VARCHAR}");
        }
        
        if (record.getIconPath() != null) {
            VALUES("icon_path", "#{iconPath,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            VALUES("type", "#{type,jdbcType=SMALLINT}");
        }
        
        if (record.getDeviceToken() != null) {
            VALUES("device_token", "#{deviceToken,jdbcType=VARCHAR}");
        }
        
        if (record.getNotification() != null) {
            VALUES("notification", "#{notification,jdbcType=BIT}");
        }
        
        if (record.getDeletedAt() != null) {
            VALUES("deleted_at", "#{deletedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            VALUES("created_at", "#{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            VALUES("updated_at", "#{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_user
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    public String selectByExample(IUserExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("id");
        } else {
            SELECT("id");
        }
        SELECT("uuid");
        SELECT("nickname");
        SELECT("icon_id");
        SELECT("icon_path");
        SELECT("type");
        SELECT("device_token");
        SELECT("notification");
        SELECT("deleted_at");
        SELECT("created_at");
        SELECT("updated_at");
        FROM("i_user");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_user
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        IUser record = (IUser) parameter.get("record");
        IUserExample example = (IUserExample) parameter.get("example");
        
        BEGIN();
        UPDATE("i_user");
        
        if (record.getId() != null) {
            SET("id = #{record.id,jdbcType=INTEGER}");
        }
        
        if (record.getUuid() != null) {
            SET("uuid = #{record.uuid,jdbcType=VARCHAR}");
        }
        
        if (record.getNickname() != null) {
            SET("nickname = #{record.nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getIconId() != null) {
            SET("icon_id = #{record.iconId,jdbcType=VARCHAR}");
        }
        
        if (record.getIconPath() != null) {
            SET("icon_path = #{record.iconPath,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            SET("type = #{record.type,jdbcType=SMALLINT}");
        }
        
        if (record.getDeviceToken() != null) {
            SET("device_token = #{record.deviceToken,jdbcType=VARCHAR}");
        }
        
        if (record.getNotification() != null) {
            SET("notification = #{record.notification,jdbcType=BIT}");
        }
        
        if (record.getDeletedAt() != null) {
            SET("deleted_at = #{record.deletedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_user
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("i_user");
        
        SET("id = #{record.id,jdbcType=INTEGER}");
        SET("uuid = #{record.uuid,jdbcType=VARCHAR}");
        SET("nickname = #{record.nickname,jdbcType=VARCHAR}");
        SET("icon_id = #{record.iconId,jdbcType=VARCHAR}");
        SET("icon_path = #{record.iconPath,jdbcType=VARCHAR}");
        SET("type = #{record.type,jdbcType=SMALLINT}");
        SET("device_token = #{record.deviceToken,jdbcType=VARCHAR}");
        SET("notification = #{record.notification,jdbcType=BIT}");
        SET("deleted_at = #{record.deletedAt,jdbcType=TIMESTAMP}");
        SET("created_at = #{record.createdAt,jdbcType=TIMESTAMP}");
        SET("updated_at = #{record.updatedAt,jdbcType=TIMESTAMP}");
        
        IUserExample example = (IUserExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_user
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    public String updateByPrimaryKeySelective(IUser record) {
        BEGIN();
        UPDATE("i_user");
        
        if (record.getUuid() != null) {
            SET("uuid = #{uuid,jdbcType=VARCHAR}");
        }
        
        if (record.getNickname() != null) {
            SET("nickname = #{nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getIconId() != null) {
            SET("icon_id = #{iconId,jdbcType=VARCHAR}");
        }
        
        if (record.getIconPath() != null) {
            SET("icon_path = #{iconPath,jdbcType=VARCHAR}");
        }
        
        if (record.getType() != null) {
            SET("type = #{type,jdbcType=SMALLINT}");
        }
        
        if (record.getDeviceToken() != null) {
            SET("device_token = #{deviceToken,jdbcType=VARCHAR}");
        }
        
        if (record.getNotification() != null) {
            SET("notification = #{notification,jdbcType=BIT}");
        }
        
        if (record.getDeletedAt() != null) {
            SET("deleted_at = #{deletedAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCreatedAt() != null) {
            SET("created_at = #{createdAt,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedAt() != null) {
            SET("updated_at = #{updatedAt,jdbcType=TIMESTAMP}");
        }
        
        WHERE("id = #{id,jdbcType=INTEGER}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table i_user
     *
     * @mbggenerated Tue Nov 18 16:00:43 JST 2014
     */
    protected void applyWhere(IUserExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}