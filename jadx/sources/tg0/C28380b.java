package tg0;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.galtandtaggart.domain.transactionhistory.model.GTTransaction;

/* renamed from: tg0.b */
public abstract class C28380b {
    /* renamed from: a */
    public static final String m87046a(C28387g gVar) {
        C41536l.m120489i(gVar, "<this>");
        String name = gVar.name();
        Locale locale = Locale.getDefault();
        C41536l.m120488h(locale, "getDefault()");
        String lowerCase = name.toLowerCase(locale);
        C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return "text.gt.dw.fintrantypeid." + lowerCase;
    }

    /* renamed from: b */
    public static final String m87047b(GTTransaction gTTransaction, boolean z) {
        boolean z2;
        SimpleDateFormat simpleDateFormat;
        C41536l.m120489i(gTTransaction, "<this>");
        if (gTTransaction.mo60153D() == null) {
            return null;
        }
        if (gTTransaction.mo60153D().length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return null;
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.getDefault());
        if (z) {
            simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        } else {
            simpleDateFormat = new SimpleDateFormat("HH:mm dd MMMM yyyy", Locale.getDefault());
        }
        Date parse = simpleDateFormat2.parse(gTTransaction.mo60153D());
        if (parse != null) {
            return simpleDateFormat.format(parse);
        }
        return null;
    }

    /* renamed from: c */
    public static final C28383e m87048c(GTTransaction gTTransaction) {
        Object obj;
        boolean z;
        C41536l.m120489i(gTTransaction, "<this>");
        Iterator it = C41333m.m119788O(C28383e.values()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            int c = ((C28383e) obj).mo68003c();
            Integer x = gTTransaction.mo60178x();
            if (x != null && c == x.intValue()) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C28383e eVar = (C28383e) obj;
        if (eVar == null) {
            return C28383e.f71923f;
        }
        return eVar;
    }

    /* renamed from: d */
    public static final C28387g m87049d(GTTransaction gTTransaction) {
        Object obj;
        C41536l.m120489i(gTTransaction, "<this>");
        Iterator it = C41333m.m119788O(C28387g.values()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((C28387g) obj).name(), gTTransaction.mo60170r())) {
                break;
            }
        }
        C28387g gVar = (C28387g) obj;
        if (gVar == null) {
            return C28387g.DEFAULT;
        }
        return gVar;
    }
}
