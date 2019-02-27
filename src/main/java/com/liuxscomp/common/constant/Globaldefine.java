package com.liuxscomp.common.constant;

import lombok.Getter;

/**
 * @package: com.touchealth.common.constant
 * @Author: Norcy
 * @Descriptions: 全局变量
 * @Date: 2017/11/7 17:21
 */
@Getter
public class Globaldefine {

    /**
     * 数据库表名称，生成主键
     */
    public static class tableIdGenerator{

        //平台
        public static final String SYS_PLATFORM = "sys_platform";
        //平台--模板
        public static final String SYS_PLATFORM_TEMPLATE = "sys_platform_template";
        public static final String SYS_MENU = "sys_menu";
        public static final String SYS_TEMPLATE_MENU = "sys_template_menu";
        public static final String SYS_ORGANIZATION = "sys_organization";
        public static final String OPS_CHANNEL_ORGANIZATION = "ops_channel_organization";
        public static final String SYS_USER = "sys_user";
        public static final String SYS_OPERATION = "sys_operation";
        public static final String SYS_CUSTOMER = "sys_customer_archive";
        public static final String SYS_USER_CUSTOMER = "sys_user_customer";
        public static final String SYS_CONFIG = "sys_config";
        public static final String SYS_BANNER = "sys_banner";
        public static final String HSP_ITEM="hsp_item";
        public static final String LIB_STANDARD_ITEM="lib_standard_item";
        public static final String LIB_STANDARD_ITEM_ALIAS="lib_standard_item_alias";
        public static final String LIB_STANDARD_ITEM_SECTION="lib_standard_item_section";
        public static final String LIB_STANDARD_ITEM_SECTION_RELATION = "lib_standard_item_section_relation";
        public static final String LIB_STANDARD_TAG_CATEGORY = "lib_standard_tag_category";
        public static final String LIB_STANDARD_TAG = "lib_standard_tag";
        public static final String LIB_STANDARD_TAG_ALIAS = "lib_standard_tag_alias";
        public static final String LIB_STANDARD_TAG_CATEGORY_RELATION = "lib_standard_tag_category_relation";
        //指标、异常相关
        public static final String LIB_STANDARD_INDICATOR = "lib_standard_indicator";
        public static final String LIB_STANDARD_INDICATOR_ALIAS = "lib_standard_indicator_alias";
        public static final String LIB_STANDARD_ABNORMAL = "lib_standard_abnormal";
        public static final String LIB_STANDARD_ABNORMAL_ALIAS = "lib_standard_abnormal_alias";
        public static final String OPS_INDICATOR = "ops_indicator";
        public static final String OPS_ABNORMAL = "ops_abnormal";
        public static final String HTH_CHECKUP_DATA = "hth_checkup_data";

        public static final String SMS_CHANNEL = "sms_channel";
        public static final String SMS_CHANNEL_SIGNATURE = "sms_channel_signature";
        public static final String SMS_CHANNEL_TEMPLATE = "sms_channel_template";
        public static final String SMS_CHANNEL_VARIABLE = "sms_channel_variable";
        public static final String SMS_RECORD = "sms_record";
        public static final String SMS_SEND = "sms_send";
        public static final String SMS_TEMPLATE = "sms_template";
        public static final String SMS_TEMPLATE_VARIABLE = "sms_template_variable";
        public static final String SMS_VARIABLE = "sms_variable";
        public static final String HSP_HOSPITAL_TAG = "hsp_hospital_tag";
        public static final String HSP_DEPARTMENT = "hsp_department";
        public static final String HSP_ACTIVITY = "hsp_activity";
        public static final String HSP_EXPERT = "hsp_expert";
        public static final String HSP_DOCTOR = "hsp_doctor";
        public static final String USE_MEDICAL_INFO = "use_medical_info";
        // 企业
        public static final String ENT_ENTERPRISE = "ent_enterprise";
        public static final String ENT_USER_AUTH = "ent_user_auth";
        public static final String ENT_GROUP_ORDER = "ent_group_order";
        public static final String ENT_GROUP_ORDER_EMPLOYEE = "ent_group_order_employee";
        public static final String ENT_GROUP_ORDER_HOSPITAL = "ent_group_order_hospital";
        public static final String ENT_GROUP_ORDER_HOSPITAL_DATE = "ent_group_order_hospital_date";
        public static final String ENT_SET_MEAL_TEMPLATE = "set_meal_template";
        public static final String ENT_SET_MEAL_TEMPLATE_SECTION_INFORMATION = "ent_set_meal_template_section_information";

        //体检报告
        public static final String HTH_CHECKUP = "hth_checkup";
        public static final String HTH_CHECKUP_SUMMARY = "hth_checkup_summary";
        public static final String HTH_CHECKUP_ITEM = "hth_checkup_item";
        public static final String HTH_CHECKUP_ABNORMAL = "hth_checkup_abnormal";
        public static final String HTH_CHECKUP_DEPT_CONCLUSION = "hth_checkup_dept_conclusion";
        public static final String HTH_CHECKUP_MAIN_ITEM = "hth_checkup_main_item";

        //套餐
        public static final String HSP_SET_MEAL = "hsp_set_meal";
        public static final String SYS_CHARACTER = "sys_character";
        public static final String SYS_SET_MEAL_TAG = "sys_set_meal_tag";
        public static final String HSP_SET_MEAL_SECTION="hsp_set_meal_section";
        public static final String HSP_SET_MEAL_INVENTORY="hsp_set_meal_inventory";
        public static final String OPS_GROUP_APPLY = "ops_group_apply";

        //活动
        public static final String OPS_PROMOTION = "ops_promotion";
        public static final String OPS_PROMOTION_TEMPLATE = "ops_promotion_template";

        //热门 热搜标签
        public static final String OPS_HOT_TAG = "ops_hot_tag";

        //问医
        public static final String OPS_USER_ASK = "ops_user_ask";
        public static final String OPS_EXPERT_ANSWER = "ops_expert_answer";
        public static final String OPS_OFF_THE_SHELF = "ops_off_the_shelf";
        public static final String OPS_ASK_ANSWER_LIKE = "ops_ask_answer_like";

        //体检加项二级类目
        public static final String HSP_ADDITIONAL_SECTION = "hsp_additional_section";

        //健康管理
        public static final String HTH_MANAGEMENT_BLOOD_SUGAR = "hth_management_blood_sugar";
        public static final String HTH_MANAGEMENT_WALK = "hth_management_walk";
        public static final String HTH_MANAGEMENT_BLOOD_PRESSURE = "hth_management_blood_pressure";

        //医院特色
        public static final String HSP_HOSPITAL_ENVIRONMENT = "hsp_hospital_environment";
        public static final String HSP_HOSPITAL_EQUIPMENT = "hsp_hospital_equipment";
        public static final String HSP_HOSPITAL_FEATURE = "hsp_hospital_feature";
        public static final String HSP_HOSPITAL_HEALTH_MANAGEMENT = "hsp_hospital_health_management";
        public static final String HSP_HOSPITAL_SERVICE_CASE = "hsp_hospital_service_case";
        //模型表
        public static final String MOD_MODEL = "mod_model";
        //文案表
        public static final String MOD_DOCUMENT = "mod_document";
        //因素表
        public static final String MOD_ELEMENT = "mod_element";
        //模型文案关系表
        public static final String MOD_MODEL_DOCUMENT_RELATION = "mod_model_document_relation";
        //模型因素关系表
        public static final String MOD_MODEL_ELEMENT_RELATION = "mod_model_element_relation";
        public static final String HTH_MODEL_RESULT = "hth_model_result";
        public static final String HTH_MODEL_RISK_RESULT = "hth_model_risk_result";
        public static final String HTH_ASSESS = "hth_assess";
        public static final String HTH_FOOD_AND_SPORT_RESULT = "hth_food_and_sport_result";
        public static final String HTH_PHYSIQUE_ASSESS_RESULT = "hth_physique_assess_result";

        //问卷
        public static final String LIB_QUESTION = "lib_question";
        public static final String LIB_QUESTION_OPTION = "lib_question_option";
        public static final String LIB_QUESTION_GROUP = "lib_question_group";
        public static final String LIB_SURVEY = "lib_survey";
        public static final String HTH_SURVEY = "hth_survey";
        public static final String HTH_SURVEY_ANSWER = "hth_survey_answer";

        //问卷新
        public static final String OPS_QUESTION = "ops_question";
        public static final String OPS_QUESTION_OPTION = "ops_question_option";
        public static final String OPS_QUESTION_RULE = "ops_question_rule";
        public static final String OPS_SURVEY_QUESTION = "ops_survey_question";
        public static final String OPS_SURVEY_QUESTION_OPTION = "ops_survey_question_option";
        public static final String OPS_SURVEY_RULE = "ops_survey_rule";
        public static final String HTH_USER_SURVEY = "hth_user_survey";
        public static final String HTH_USER_QUESTION = "hth_user_question";
        public static final String HTH_USER_QUESTION_OPTION = "hth_user_question_option";
        public static final String HTH_USER_QUESTION_RULE = "hth_user_question_rule";
        public static final String HTH_USER_ANSWER = "hth_user_answer";
        public static final String OPS_SURVEY_COLUMN = "ops_survey_column";

        //智能助手记录
        public static final String SYS_IA_RECORD = "sys_ia_record";

        //系统用户账号设备关联
        public static final String SYS_USER_DEVICE = "sys_user_device";

        //推送记录
        public static final String PUSH_RECORD = "push_record";

        // 模型计算结果保存
        public static final String MODEL_REPORT = "modelReport";

        // 模型计算结果保存
        public static final String HTH_PRR_MODEL = "hth_prr_model";

        // 模型计算结果保存
        public static final String HTH_PRR_MODEL_RESULT = "hth_prr_model_result";

        // 用户微信关联信息
        public static final String SYS_USER_THIRDPARTY_AUTH = "sys_user_thirdparty_auth";
        public static final String SYS_USER_THIRDPARTY = "sys_user_thirdparty";

        // 预约操作日志
        public static final String RESERVATION_OPERATE_LOG = "reservation_operate_log";

        // 微信模板消息发送
        public static final String WECHAT_MSG_RECORD = "wechat_msg_record";

        // 客户健康画像
        public static final String CUSTOMER_HEALTH_PORTRAIT = "sys_customer_health_portrait";

        //因素
        public static final String FACTOR = "mod_factor";

        //因素分组
        public static final String FACTOR_GROUP = "mod_factor_group";

        //因素分组方式
        public static final String FACTOR_GROUP_MODE = "mod_factor_group_mode";

        //因素分组结果
        public static final String FACTOR_GROUP_RESULT = "hth_factor_group_result";

        //模型和文案关系
        public static final String MODEL_DOCUMENT_RELATION = "mod_model_document_relation";

        //模型
        public static final String MODEL = "mod_model";

        //模型因素
        public static final String MODEL_FACTOR = "mod_model_factor";

        //模型因素分组
        public static final String MODEL_FACTOR_GROUP = "mod_model_factor_group";

        //模型因素分组方式
        public static final String MODEL_FACTOR_GROUP_MODE = "mod_model_factor_group_mode";

        //
        public static final String MODEL_RESULT_DOC_RELATION = "mod_model_result_doc_relation";


        // 报告申领
        public static final String OPS_APPLY_RETRIEVE = "ops_apply_retrieve";

        // ops操作日志
        public static final String OPS_OPERATION_LOG = "ops_operation_log";

        //公众号
        public static final String OPS_OFFICIAL_ACCOUNTS = "ops_official_accounts";
        public static final String OPS_SCENE_CODE = "ops_scene_code";
        public static final String OPS_SCENE_CODE_MESSAGE = "ops_scene_code_message";

        public static final String OPS_SCENE_CODE_PROMOTION = "ops_scene_code_promotion";

        public static final String OPS_USER_HIT = "ops_user_hit";

        public static final String OPS_PUBNUM_SUBSCRIBE_INFO = "ops_pubnum_subscribe_info";

        public static final String SYS_USER_REGISTRATION = "sys_user_registration";

        //小程序发送消息表单id
        public static final String MINIPROGRAM_FORM_ID = "miniprogram_form_id";
        //微信消息模板
        public static final String WECHAT_MSG_TEMPLATE = "wechat_msg_template";

        //标签
        public static final String OPS_TAG = "ops_tag";

        public static final String OPS_CHANNEL = "ops_channel";

        public static final String SYS_TOUCFILE = "sys_toucfile";

        public static final String SYS_TOUCFILE_BUCKET = "sys_toucfile_bucket";

        // 售后申请单
        public static final String T_AFTER_SALE = "t_after_sale";
        //第三方请求任务
        public static final String OPS_COOPERATION_REQUEST_TASK = "ops_cooperation_request_task";
        public static final String OPS_COOPERATION_SEND_LOG = "ops_cooperation_send_log";
        public static final String OPS_COOPERATION_SEND_TASK = "ops_cooperation_send_task";
        public static final String OPS_COOPERATION_PARTNER_HOSPITAL = "ops_cooperation_partner_hospital";
        public static final String OPS_COOPERATION_PARTNER_SET_MEAL = "ops_cooperation_partner_set_meal";
        // 用户积分
        public static final String USR_CREDIT_ACCOUNT = "usr_credit_account";
        public static final String USR_CREDIT_RECORD = "usr_credit_record";
        public static final String USR_CREDIT_ORDER = "usr_credit_order";

        //积分管理
        public static final String OPS_CREDIT_TASK = "ops_credit_task";
        public static final String OPS_CREDIT_RULE = "ops_credit_rule";
        public static final String OPS_CREDIT_GOODS = "ops_credit_goods";
        public static final String OPS_CREDIT_GAME = "ops_credit_game";

        public static final String INT_LIBRARY = "int_library";

        // 设备管理表
        public static final String OPS_EQUIPMENT = "ops_equipment";

        public static final String SYS_DEPARTMENT = "sys_department";

        public static final String SYS_USER_MENU = "sys_user_menu";

        // 个检全局体检日期设置表
        public static final String HSP_HOSPITAL_GLOBAL_DATE="hsp_hospital_global_date";

        public static final String USER_INDICATORS_HISTORY="user_indicators_history";

        // 加项三级表
        public static final String HSP_ADDITIONAL_SECTION_ITEM = "hsp_additional_section_item";

        // 关联表
        public static final String HSP_ADDITIONAL_SECTION_ITEM_HSP_ITEM = "hsp_additional_section_item_hsp_item";
        //选项标签关联表
        public static final String OPS_OPTION_TAG_RELATION = "ops_option_tag_relation";

        public static final String ENT_GROUP_ADDITIONAL_SECTION_ITEM = "ent_group_additional_section_item";

        public static final String ENT_GROUP_ADDITIONAL_ITEM_HSP_ITEM = "ent_group_additional_item_hsp_item";

        /** 健康记录 */
        public static final String HTH_RECORD_REPORT = "hth_record_report";
        //问卷配置表
        public static final String OPS_SURVEY_CONFIGURE = "ops_survey_configure";
        //问卷配置结果文案表
        public static final String OPS_SURVEY_RESULT_DOC = "ops_survey_result_doc";
        /** 中医体质合作机构推广产品表 */
        public static final String OPS_PHYSIQUE_PRODUCT_INFO = "ops_physique_product_info";

        // 套餐组合表
        public static final String OPS_COOPERATION_SET_MEAL_COMBINATION = "ops_cooperation_set_meal_combination";

        // 套餐组合sku
        public static final String OPS_COOPERATION_SET_MEAL_SKU = "ops_cooperation_set_meal_sku";
    }

    /**
     * Redis生成主键脚本
     */
    public static class redisScript{
        public static final String ID_GENERATOR_SCRIPT = "/redis-script-id-generator.lua";
    }


    public static class jwt{
        /**
         * 数据请求返回码
         */
        public static final int RESCODE_SUCCESS = 1000;             //成功
        public static final int RESCODE_SUCCESS_MSG = 1001;         //成功(有返回信息)
        public static final int RESCODE_EXCEPTION = 1002;           //请求抛出异常
        public static final int RESCODE_NOLOGIN = 1003;             //未登陆状态
        public static final int RESCODE_NOEXIST = 1004;             //查询结果为空
        public static final int RESCODE_NOAUTH = 1005;              //无操作权限
        public static final int RESCODE_DELETE = 1006;              //已被删除
        public static final int RESCODE_DISABLE = 1007;             //已被禁用
        /**
         * jwt
         */
        public static final String JWT_ID = "jwt";
        public static final String JWT_SECRET = "7786df7fc3a34e26a61c034d5ec8245d";
        /**jwtToken有效时间*/
        public static final int JWT_TTL = 356*24*60*60*1000;  //millisecond

        public static final int JWT_REFRESH_INTERVAL = 55*60*1000;  //millisecond

        /**jwtToken有效刷新时间*/
        public static final int JWT_REFRESH_TTL = 7*24*60*60*1000;  //millisecond

        /**jwtToken缓冲失效时间*/
        public static final int JWT_PADDING_TTL = 3*60*1000;  //millisecond
    }

    public static class otherPlatform{
        public static final String OPEN_ID = "openId";
    }

    //restTemplate 常量信息
    public static final class RESTHEADER{
        //请求头部授权信息
        public static final String AUTHORIZATION="Basic  "+"c2VlY2hhbmd0ZWNoOkhac3prajIwMTU=";
    }

    /**
     * 同步任务Key
     */
    public static final class taskKey{
        public static final String CHECKUP_SYNC = "batch_checkup_sync";
    }

    /**
     * 性别
     */
    public static final class sex{
        public static final String MAN = "男";
        public static final String WOMEN = "女";
        public static final String UNLIMITED = "不限";
        public static final String SECRECY = "保密";
    }

    /**
     * 婚姻状态
     */
    public static final class MaritalStatus{
        public static final String MARRIED = "已婚";
        public static final String UNMARRIED = "未婚";
        public static final String UNLIMITED = "不限";
        public static final String SECRECY = "保密";
    }

    /**
     * 客户端类型
     */
    public static final class clientType{
        public static final String IOS = "ios";
        public static final String ANDROID = "android";
        public static final String WEB = "web";
    }

    /**
     * 客户端类型
     */
    public static final class AppTokenType{
        public static final String MOBILE_APP_TOKEN = "mobile_app_token";
        public static final String EXPERT_APP_TOKEN = "expert_app_token";
        public static final String INTERVENTION_APP_TOKEN = "intervention_app_token";
    }


    @Getter
    public enum IdentityType { // 0-身份证 1-护照 2-军官证 3-医保卡 4-居住证 5-驾驶证
        ID_CARD("0", "身份证"),
        PASPORT("1", "护照"),
        MILITARY_ID("2", "军官证"),
        MEDICAL_INSURANCE_CARD("3", "医保卡"),
        RESIDENCE_PERMIT("4", "居住证"),
        DRIVER_LICENSE("5", "驾驶证")
        ;

        private String code;
        private String name;

        IdentityType(String code, String name) {
            this.code = code;
            this.name = name;
        }
    }




}
