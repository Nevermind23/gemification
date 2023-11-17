package com.salesforce.marketingcloud.sfmcsdk.components.logging;

import af1.C40296c;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import te1.C42994a;
import ue1.C43064a;

public abstract class Logger {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int MAX_TAG_LENGTH = 23;
    private static final String REDACTED_VALUE_REPLACEMENT_TEXT = "[REDACTED]";
    private LogListener listener;
    private LogLevel logLevel = LogLevel.ERROR;
    private List<String> redactedValues = C41341q.m119907j();

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ void d$default(Logger logger, String str, Throwable th, C43064a aVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                th = null;
            }
            logger.mo31451d(str, th, aVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: d");
    }

    public static /* synthetic */ void e$default(Logger logger, String str, Throwable th, C43064a aVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                th = null;
            }
            logger.mo31453e(str, th, aVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: e");
    }

    private final String formatMsg(String str) {
        if (TextUtils.getTrimmedLength(str) == 0) {
            return "FORMATTED LOG MESSAGE WAS EMPTY";
        }
        for (String str2 : getRedactedValues()) {
            if (!C41536l.m120484d(REDACTED_VALUE_REPLACEMENT_TEXT, str2)) {
                str = C40439w.m117122z(str, str2, REDACTED_VALUE_REPLACEMENT_TEXT, true);
            }
        }
        return str;
    }

    private final String formatTag(String str) {
        if (str.length() <= 23) {
            return str;
        }
        return str.subSequence(0, 23).toString();
    }

    public static /* synthetic */ void log$sfmcsdk_release$default(Logger logger, LogLevel logLevel2, String str, Throwable th, C43064a aVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                th = null;
            }
            logger.log$sfmcsdk_release(logLevel2, str, th, aVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
    }

    public static /* synthetic */ void w$default(Logger logger, String str, Throwable th, C43064a aVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                th = null;
            }
            logger.mo31462w(str, th, aVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: w");
    }

    public final String createTag(C40296c cVar) {
        C41536l.m120489i(cVar, "clazz");
        String simpleName = C42994a.m123348a(cVar).getSimpleName();
        C41536l.m120488h(simpleName, "clazz.java.simpleName");
        return createTag(simpleName);
    }

    /* renamed from: d */
    public void mo31452d(String str, C43064a aVar) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(aVar, "lazyMsg");
        mo31451d(str, (Throwable) null, aVar);
    }

    /* renamed from: e */
    public void mo31454e(String str, C43064a aVar) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(aVar, "lazyMsg");
        mo31453e(str, (Throwable) null, aVar);
    }

    public LogListener getListener() {
        return this.listener;
    }

    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    public List<String> getRedactedValues() {
        return this.redactedValues;
    }

    public final void log$sfmcsdk_release(LogLevel logLevel2, String str, Throwable th, C43064a aVar) {
        C41536l.m120489i(logLevel2, "lvl");
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(aVar, "lazyMsg");
        LogListener listener2 = getListener();
        if (listener2 != null && logLevel2.compareTo(getLogLevel()) >= 0) {
            try {
                listener2.out(logLevel2, formatTag(str), formatMsg((String) aVar.invoke()), th);
            } catch (Exception e) {
                Log.e("~$Logger", C41536l.m120497q("Exception was thrown by ", listener2.getClass().getName()), e);
            }
        }
    }

    public void setListener(LogListener logListener) {
        this.listener = logListener;
    }

    public void setLogLevel(LogLevel logLevel2) {
        C41536l.m120489i(logLevel2, "<set-?>");
        this.logLevel = logLevel2;
    }

    public void setRedactedValues(List<String> list) {
        C41536l.m120489i(list, "<set-?>");
        this.redactedValues = list;
    }

    /* renamed from: w */
    public void mo31463w(String str, C43064a aVar) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(aVar, "lazyMsg");
        mo31462w(str, (Throwable) null, aVar);
    }

    public final String createTag(String str) {
        C41536l.m120489i(str, "tag");
        return formatTag(str);
    }

    /* renamed from: d */
    public void mo31451d(String str, Throwable th, C43064a aVar) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(aVar, "lazyMsg");
        log$sfmcsdk_release(LogLevel.DEBUG, str, th, aVar);
    }

    /* renamed from: e */
    public void mo31453e(String str, Throwable th, C43064a aVar) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(aVar, "lazyMsg");
        log$sfmcsdk_release(LogLevel.ERROR, str, th, aVar);
    }

    /* renamed from: w */
    public void mo31462w(String str, Throwable th, C43064a aVar) {
        C41536l.m120489i(str, "tag");
        C41536l.m120489i(aVar, "lazyMsg");
        log$sfmcsdk_release(LogLevel.WARN, str, th, aVar);
    }
}
