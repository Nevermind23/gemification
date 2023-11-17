package p017b;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.C0767a;
import he1.C41224m;
import he1.C41233s;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p017b.C2101a;

/* renamed from: b.b */
public final class C2103b extends C2101a {

    /* renamed from: a */
    public static final C2104a f6260a = new C2104a((DefaultConstructorMarker) null);

    /* renamed from: b.b$a */
    public static final class C2104a {
        private C2104a() {
        }

        public /* synthetic */ C2104a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Intent mo7002a(String[] strArr) {
            C41536l.m120489i(strArr, "input");
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            C41536l.m120488h(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }
    }

    /* renamed from: d */
    public Intent mo4464a(Context context, String[] strArr) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(strArr, "input");
        return f6260a.mo7002a(strArr);
    }

    /* renamed from: e */
    public C2101a.C2102a mo6997b(Context context, String[] strArr) {
        boolean z;
        boolean z2;
        C41536l.m120489i(context, "context");
        C41536l.m120489i(strArr, "input");
        boolean z3 = true;
        if (strArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C2101a.C2102a(C41344r0.m119928j());
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (C0767a.m2891a(context, strArr[i]) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z3 = false;
                break;
            }
            i++;
        }
        if (!z3) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C43429k.m124585d(C41342q0.m119921f(strArr.length), 16));
        for (String a : strArr) {
            C41224m a2 = C41233s.m119492a(a, Boolean.TRUE);
            linkedHashMap.put(a2.mo95678e(), a2.mo95680f());
        }
        return new C2101a.C2102a(linkedHashMap);
    }

    /* renamed from: f */
    public Map mo4465c(int i, Intent intent) {
        boolean z;
        if (i != -1) {
            return C41344r0.m119928j();
        }
        if (intent == null) {
            return C41344r0.m119928j();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return C41344r0.m119928j();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(Boolean.valueOf(z));
        }
        return C41344r0.m119939u(C41358y.m119996G0(C41333m.m119795t(stringArrayExtra), arrayList));
    }
}
