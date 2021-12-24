package com.myproject.iam.utils.constants;

/**
 * @author zhe.liu
 */
public class Constants {
    /**
     * 前端访问头部Token名
     */
    public final static String TOKEN_NAME = "Authorization";

    /**
     * 前端访问头部language
     */
    public final static String LANGUAGE = "language";

    /**
     * 默认父级ID
     */
    public final static Long DEFAULT_PARENT_ID = 0L;

    /**
     * token jti redis key 前缀
     */
    public final static String TOKEN_JTI_REDIS_PREFIX = "G-IAM:TOKEN-JTI:";

    /**
     * token authority redis key 前缀
     */
    public final static String TOKEN_AUTHORITY_REDIS_PREFIX = "G-IAM:AUTHORITY:";

    /**
     * token user jti redis key 前缀
     */
    public final static String TOKEN_USER_JTI_REDIS_PREFIX = "G-IAM:TOKEN-USER-JTI:";

    /**
     * 短信验证码redis前缀
     */
    public final static String SMS_REDIS_PREFIX = "SMS:";

    /**
     * 短信验证码每天发送最大限制 redis前缀
     */
    public final static String SMS_DAILY_SEND_MAX_LIMIT_PREFIX = "SMS:DAILY_SEND_MAX_LIMIT:";

    /**
     * 短信验证码每天发送最大限制
     */
    public final static Integer SMS_DAILY_SEND_MAX_COUNT = 10;

    /**
     * 短信验证码验证同一手机号最大重次数
     */
    public final static String SMS_MOBILE_VERIFY_RETRY_MAX_PREFIX = "SMS:MOBILE_VERIFY_RETRY_MAX_PREFIX:";

    /**
     * 短信验证码验证同一手机号最大重次数
     */
    public final static Integer SMS_MOBILE_VERIFY_RETRY_MAX = 10;

    /**
     * 短信登录验证码模板id
     */
    public final static String SMS_LOGIN_TEMPLATE_ID = "1176296";

    /**
     * 短信重置密码验证码模板id
     */
    public final static String SMS_RESET_PWD_TEMPLATE_ID = "1176296";


}
