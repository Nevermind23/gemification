package uf1;

import he1.C41238w;
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import pf1.C42197d;

/* renamed from: uf1.c */
public abstract class C43089c {

    /* renamed from: a */
    private static final C43090a f100519a = new C43090a();

    /* renamed from: b */
    private static final String[] f100520b;

    /* renamed from: c */
    private static final DateFormat[] f100521c;

    /* renamed from: uf1.c$a */
    public static final class C43090a extends ThreadLocal {
        C43090a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public DateFormat initialValue() {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.setTimeZone(C42197d.f99269f);
            return simpleDateFormat;
        }
    }

    static {
        String[] strArr = {"EEE, dd MMM yyyy HH:mm:ss zzz", "EEEE, dd-MMM-yy HH:mm:ss zzz", "EEE MMM d HH:mm:ss yyyy", "EEE, dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MMM-yyyy HH-mm-ss z", "EEE, dd MMM yy HH:mm:ss z", "EEE dd-MMM-yyyy HH:mm:ss z", "EEE dd MMM yyyy HH:mm:ss z", "EEE dd-MMM-yyyy HH-mm-ss z", "EEE dd-MMM-yy HH:mm:ss z", "EEE dd MMM yy HH:mm:ss z", "EEE,dd-MMM-yy HH:mm:ss z", "EEE,dd-MMM-yyyy HH:mm:ss z", "EEE, dd-MM-yyyy HH:mm:ss z", "EEE MMM d yyyy HH:mm:ss z"};
        f100520b = strArr;
        f100521c = new DateFormat[strArr.length];
    }

    /* renamed from: a */
    public static final Date m123628a(String str) {
        boolean z;
        C41536l.m120489i(str, "<this>");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        ParsePosition parsePosition = new ParsePosition(0);
        Date parse = ((DateFormat) f100519a.get()).parse(str, parsePosition);
        if (parsePosition.getIndex() == str.length()) {
            return parse;
        }
        String[] strArr = f100520b;
        synchronized (strArr) {
            int length = strArr.length;
            int i = 0;
            while (i < length) {
                int i2 = i + 1;
                DateFormat[] dateFormatArr = f100521c;
                DateFormat dateFormat = dateFormatArr[i];
                if (dateFormat == null) {
                    dateFormat = new SimpleDateFormat(f100520b[i], Locale.US);
                    dateFormat.setTimeZone(C42197d.f99269f);
                    dateFormatArr[i] = dateFormat;
                }
                parsePosition.setIndex(0);
                Date parse2 = dateFormat.parse(str, parsePosition);
                if (parsePosition.getIndex() != 0) {
                    return parse2;
                }
                i = i2;
            }
            C41238w wVar = C41238w.f97225a;
            return null;
        }
    }

    /* renamed from: b */
    public static final String m123629b(Date date) {
        C41536l.m120489i(date, "<this>");
        String format = ((DateFormat) f100519a.get()).format(date);
        C41536l.m120488h(format, "STANDARD_DATE_FORMAT.get().format(this)");
        return format;
    }
}
