package com.salesforce.marketingcloud.sfmcsdk.util;

import android.content.Context;
import com.salesforce.marketingcloud.sfmcsdk.components.logging.SFMCSdkLogger;
import java.lang.reflect.Field;
import kotlin.jvm.internal.C41536l;

public final class ApplicationUtils {
    public static final ApplicationUtils INSTANCE = new ApplicationUtils();
    public static final String TAG = "~$ApplicationUtils";

    private ApplicationUtils() {
    }

    private final String findBuildConfig(String str) {
        try {
            Class.forName(C41536l.m120497q(str, ".BuildConfig"));
            return str;
        } catch (Exception unused) {
            if (C40440x.m117161c0(str, ".", 0, false, 6, (Object) null) <= 0) {
                return null;
            }
            int c0 = C40440x.m117161c0(str, ".", 0, false, 6, (Object) null);
            if (str != null) {
                String substring = str.substring(0, c0);
                C41536l.m120488h(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                return findBuildConfig(substring);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    public static final String getApplicationName(Context context) {
        C41536l.m120489i(context, "context");
        try {
            return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        } catch (Exception e) {
            SFMCSdkLogger.INSTANCE.mo31453e(TAG, e, ApplicationUtils$getApplicationName$1.INSTANCE);
            return null;
        }
    }

    public static final String getApplicationVersion(Context context) {
        C41536l.m120489i(context, "context");
        try {
            ApplicationUtils applicationUtils = INSTANCE;
            String packageName = context.getPackageName();
            C41536l.m120488h(packageName, "context.packageName");
            Field field = Class.forName(C41536l.m120497q(applicationUtils.findBuildConfig(packageName), ".BuildConfig")).getField("VERSION_NAME");
            C41536l.m120488h(field, "clazz.getField(\"VERSION_NAME\")");
            field.setAccessible(true);
            Object obj = field.get((Object) null);
            if (obj != null) {
                return (String) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception e) {
            SFMCSdkLogger.INSTANCE.mo31453e(TAG, e, ApplicationUtils$getApplicationVersion$1.INSTANCE);
            return null;
        }
    }
}
