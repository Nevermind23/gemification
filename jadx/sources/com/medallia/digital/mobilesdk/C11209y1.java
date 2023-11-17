package com.medallia.digital.mobilesdk;

/* renamed from: com.medallia.digital.mobilesdk.y1 */
public class C11209y1 {

    /* renamed from: com.medallia.digital.mobilesdk.y1$a */
    static /* synthetic */ class C11210a {

        /* renamed from: a */
        static final /* synthetic */ int[] f32252a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.medallia.digital.mobilesdk.ValueType[] r0 = com.medallia.digital.mobilesdk.ValueType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32252a = r0
                com.medallia.digital.mobilesdk.ValueType r1 = com.medallia.digital.mobilesdk.ValueType.TypeInteger     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32252a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.medallia.digital.mobilesdk.ValueType r1 = com.medallia.digital.mobilesdk.ValueType.TypeLong     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f32252a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.medallia.digital.mobilesdk.ValueType r1 = com.medallia.digital.mobilesdk.ValueType.TypeString     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f32252a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.medallia.digital.mobilesdk.ValueType r1 = com.medallia.digital.mobilesdk.ValueType.TypeDouble     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f32252a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.medallia.digital.mobilesdk.ValueType r1 = com.medallia.digital.mobilesdk.ValueType.TypeBoolean     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C11209y1.C11210a.<clinit>():void");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.y1$b */
    protected enum C11211b {
        sdkInit,
        updateConfiguration,
        enableIntercept,
        backToForeground,
        customParameters,
        evaluationTimer
    }

    /* renamed from: com.medallia.digital.mobilesdk.y1$c */
    enum C11212c {
        GREATER_THAN,
        SMALLER_THAN,
        EQUALS,
        DOES_NOT_EQUAL,
        MATCH,
        CONTAINS,
        HAS_VALUE,
        ENDS_WITH,
        STARTS_WITH,
        DOES_NOT_CONTAIN,
        DIFF;

        /* renamed from: a */
        protected static C11212c m41112a(String str) {
            if (str == null) {
                return null;
            }
            String upperCase = str.replaceAll("([a-z])([A-Z]+)", "$1_$2").toUpperCase();
            upperCase.hashCode();
            char c = 65535;
            switch (upperCase.hashCode()) {
                case -695074750:
                    if (upperCase.equals("DOES_NOT_EQUAL")) {
                        c = 0;
                        break;
                    }
                    break;
                case -519581876:
                    if (upperCase.equals("HAS_VALUE")) {
                        c = 1;
                        break;
                    }
                    break;
                case -57689300:
                    if (upperCase.equals("SMALLER_THAN")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2098181:
                    if (upperCase.equals("DIFF")) {
                        c = 3;
                        break;
                    }
                    break;
                case 73130405:
                    if (upperCase.equals("MATCH")) {
                        c = 4;
                        break;
                    }
                    break;
                case 209890914:
                    if (upperCase.equals("DOES_NOT_CONTAIN")) {
                        c = 5;
                        break;
                    }
                    break;
                case 215180831:
                    if (upperCase.equals("CONTAINS")) {
                        c = 6;
                        break;
                    }
                    break;
                case 972152550:
                    if (upperCase.equals("GREATER_THAN")) {
                        c = 7;
                        break;
                    }
                    break;
                case 1027273133:
                    if (upperCase.equals("ENDS_WITH")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1213247476:
                    if (upperCase.equals("STARTS_WITH")) {
                        c = 9;
                        break;
                    }
                    break;
                case 2052813759:
                    if (upperCase.equals("EQUALS")) {
                        c = 10;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return DOES_NOT_EQUAL;
                case 1:
                    return HAS_VALUE;
                case 2:
                    return SMALLER_THAN;
                case 3:
                    return DIFF;
                case 4:
                    return MATCH;
                case 5:
                    return DOES_NOT_CONTAIN;
                case 6:
                    return CONTAINS;
                case 7:
                    return GREATER_THAN;
                case 8:
                    return ENDS_WITH;
                case 9:
                    return STARTS_WITH;
                case 10:
                    return EQUALS;
                default:
                    return null;
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.y1$d */
    enum C11213d {
        OR,
        AND,
        MIN,
        MAX;

        /* renamed from: a */
        protected static C11213d m41113a(String str) {
            if (str == null) {
                return null;
            }
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            char c = 65535;
            switch (upperCase.hashCode()) {
                case 2531:
                    if (upperCase.equals("OR")) {
                        c = 0;
                        break;
                    }
                    break;
                case 64951:
                    if (upperCase.equals("AND")) {
                        c = 1;
                        break;
                    }
                    break;
                case 76100:
                    if (upperCase.equals("MAX")) {
                        c = 2;
                        break;
                    }
                    break;
                case 76338:
                    if (upperCase.equals("MIN")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return OR;
                case 1:
                    return AND;
                case 2:
                    return MAX;
                case 3:
                    return MIN;
                default:
                    return null;
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.y1$e */
    enum C11214e {
        MULT,
        ADD,
        SUBSTRACT,
        DIVIDE,
        LOWER_CASE,
        UPPER_CASE,
        ABS;

        /* renamed from: a */
        protected static C11214e m41114a(String str) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1149711155:
                    if (str.equals("UPPER_CASE")) {
                        c = 0;
                        break;
                    }
                    break;
                case -977838367:
                    if (str.equals("SUBSTRACT")) {
                        c = 1;
                        break;
                    }
                    break;
                case 64594:
                    if (str.equals("ABS")) {
                        c = 2;
                        break;
                    }
                    break;
                case 64641:
                    if (str.equals("ADD")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2378032:
                    if (str.equals("MULT")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1741135310:
                    if (str.equals("LOWER_CASE")) {
                        c = 5;
                        break;
                    }
                    break;
                case 2016833657:
                    if (str.equals("DIVIDE")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return UPPER_CASE;
                case 1:
                    return SUBSTRACT;
                case 2:
                    return ABS;
                case 3:
                    return ADD;
                case 4:
                    return MULT;
                case 5:
                    return LOWER_CASE;
                case 6:
                    return DIVIDE;
                default:
                    return null;
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.y1$f */
    enum C11215f {
        TIME_NOW;

        /* renamed from: a */
        protected static C11215f m41115a(String str) {
            if (str == null) {
                return null;
            }
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            if (!upperCase.equals("TIME_NOW")) {
                return null;
            }
            return TIME_NOW;
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.y1$g */
    enum C11216g {
        VALUE,
        TIMESTAMP;

        /* renamed from: a */
        protected static C11216g m41116a(String str) {
            if (str == null) {
                return null;
            }
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            if (upperCase.equals("TIMESTAMP")) {
                return TIMESTAMP;
            }
            if (!upperCase.equals("VALUE")) {
                return null;
            }
            return VALUE;
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.y1$h */
    enum C11217h {
        USER_JOURNEY,
        OS,
        CUSTOM_PARAM,
        OCQ_RULE;

        /* renamed from: a */
        protected static C11217h m41117a(String str) {
            if (str == null) {
                return null;
            }
            char c = 65535;
            switch (str.hashCode()) {
                case -1936143572:
                    if (str.equals("USER_JOURNEY")) {
                        c = 0;
                        break;
                    }
                    break;
                case -334435809:
                    if (str.equals("CUSTOM_PARAM")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2532:
                    if (str.equals("OS")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1985490174:
                    if (str.equals("OCQ_RULE")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return USER_JOURNEY;
                case 1:
                    return CUSTOM_PARAM;
                case 2:
                    return OS;
                case 3:
                    return OCQ_RULE;
                default:
                    return null;
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.y1$i */
    enum C11218i {
        INTEGER,
        STRING,
        DOUBLE,
        BOOLEAN;

        /* renamed from: a */
        protected static C11218i m41118a(ValueType valueType) {
            if (valueType == null) {
                return null;
            }
            int i = C11210a.f32252a[valueType.ordinal()];
            if (i == 1 || i == 2) {
                return INTEGER;
            }
            if (i == 3) {
                return STRING;
            }
            if (i == 4) {
                return DOUBLE;
            }
            if (i != 5) {
                return null;
            }
            return BOOLEAN;
        }

        /* renamed from: a */
        protected static C11218i m41119a(String str) {
            if (str == null) {
                return null;
            }
            String upperCase = str.toUpperCase();
            upperCase.hashCode();
            char c = 65535;
            switch (upperCase.hashCode()) {
                case -1838656495:
                    if (upperCase.equals("STRING")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1618932450:
                    if (upperCase.equals("INTEGER")) {
                        c = 1;
                        break;
                    }
                    break;
                case 782694408:
                    if (upperCase.equals("BOOLEAN")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2022338513:
                    if (upperCase.equals("DOUBLE")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    return STRING;
                case 1:
                    return INTEGER;
                case 2:
                    return BOOLEAN;
                case 3:
                    return DOUBLE;
                default:
                    return null;
            }
        }
    }
}
