package p341ge.bog.mobilebank.cleanarch.presentation.common.manager.popupmanager;

import android.app.Dialog;
import androidx.fragment.app.C1483c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1616p;
import androidx.lifecycle.C1646z;
import ce1.C40397a;
import de1.C40640a;
import g10.C20589a;
import g10.C20590b;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.DialogManager;
import p644vj.C18394d;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.manager.popupmanager.PopupManager */
public final class PopupManager implements C1616p {

    /* renamed from: k */
    public static final C21538a f57591k = new C21538a((DefaultConstructorMarker) null);

    /* renamed from: l */
    private static int f57592l = C21539b.values().length;

    /* renamed from: d */
    private final DialogManager f57593d;

    /* renamed from: e */
    private final FragmentManager f57594e;

    /* renamed from: f */
    private final C21546a f57595f;

    /* renamed from: g */
    private boolean f57596g;

    /* renamed from: h */
    private HashMap f57597h = new HashMap();

    /* renamed from: i */
    private C41204a f57598i;

    /* renamed from: j */
    private boolean f57599j = true;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.manager.popupmanager.PopupManager$a */
    public static final class C21538a {
        private C21538a() {
        }

        public /* synthetic */ C21538a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.manager.popupmanager.PopupManager$b */
    public enum C21539b {
        COMMON_POPUP,
        CALCULATE_LIMITS,
        LIABILITY_OVERDUE_DIALOG,
        GAMIFICATION_POPUP,
        TRUSTED_DEVICE_DIALOG_ID,
        POST_NOTIFICATION_PERMISSION,
        IBAN_NOTIFICATION_DIALOG,
        CLIENT_GIFT_CARDS,
        CLIENT_BIRTHDAY_DIALOG_ID,
        GOOGLE_PAY_ID,
        JUNIOR_DIALOG_ID,
        DIGITAL_CARD_ON_BOARDING_DIALOG_ID,
        EXPIRING_CARD_POPUP,
        REFERRALS_POPUP_DIALOG_ID,
        REFERRALS_PASSIVE_POPUP_DIALOG_ID,
        CARD_CAMPAIGN_OFFER_ID,
        PLUS_ACTIVATION_DIALOG_ID,
        LOCATION_PERMISSION_DIALOG_ID,
        SMS_TO_PUSH_DIALOG_ID,
        LOYALTY_PROGRESS_STATUS_CHANGE
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.manager.popupmanager.PopupManager$c */
    public static abstract class C21540c {

        /* renamed from: b */
        public static final C21541a f57621b = new C21541a((DefaultConstructorMarker) null);

        /* renamed from: a */
        private boolean f57622a;

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.manager.popupmanager.PopupManager$c$a */
        public static final class C21541a {
            private C21541a() {
            }

            public /* synthetic */ C21541a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C21540c mo53852a(C1483c cVar, boolean z) {
                if (cVar != null) {
                    return new C21542b(cVar, z);
                }
                return null;
            }
        }

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.manager.popupmanager.PopupManager$c$b */
        public static final class C21542b extends C21540c {

            /* renamed from: c */
            private final C1483c f57623c;

            /* renamed from: d */
            private boolean f57624d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21542b(C1483c cVar, boolean z) {
                super(z, (DefaultConstructorMarker) null);
                C41536l.m120489i(cVar, "dialog");
                this.f57623c = cVar;
                this.f57624d = z;
            }

            /* renamed from: a */
            public boolean mo53850a() {
                return this.f57624d;
            }

            /* renamed from: b */
            public void mo53851b(DialogManager dialogManager, FragmentManager fragmentManager, String str) {
                C41536l.m120489i(dialogManager, "dialogManager");
                C41536l.m120489i(fragmentManager, "fragmentManager");
                dialogManager.mo53586f(this.f57623c, fragmentManager, str);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21542b)) {
                    return false;
                }
                C21542b bVar = (C21542b) obj;
                return C41536l.m120484d(this.f57623c, bVar.f57623c) && this.f57624d == bVar.f57624d;
            }

            public int hashCode() {
                int hashCode = this.f57623c.hashCode() * 31;
                boolean z = this.f57624d;
                if (z) {
                    z = true;
                }
                return hashCode + (z ? 1 : 0);
            }

            public String toString() {
                C1483c cVar = this.f57623c;
                boolean z = this.f57624d;
                return "DialogFragmentWrapper(dialog=" + cVar + ", showInBatch=" + z + ")";
            }
        }

        public /* synthetic */ C21540c(boolean z, DefaultConstructorMarker defaultConstructorMarker) {
            this(z);
        }

        /* renamed from: a */
        public abstract boolean mo53850a();

        /* renamed from: b */
        public abstract void mo53851b(DialogManager dialogManager, FragmentManager fragmentManager, String str);

        private C21540c(boolean z) {
            this.f57622a = z;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.manager.popupmanager.PopupManager$d */
    static final class C21543d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PopupManager f57625d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21543d(PopupManager popupManager) {
            super(1);
            this.f57625d = popupManager;
        }

        /* renamed from: a */
        public final void mo53856a(C21539b bVar) {
            PopupManager popupManager = this.f57625d;
            C41536l.m120488h(bVar, "it");
            popupManager.m69667n(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53856a((C21539b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.manager.popupmanager.PopupManager$e */
    static final class C21544e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PopupManager f57626d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21544e(PopupManager popupManager) {
            super(1);
            this.f57626d = popupManager;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            PopupManager popupManager = this.f57626d;
            C41536l.m120488h(bool, "it");
            popupManager.m69668o(bool.booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.manager.popupmanager.PopupManager$f */
    public static final class C21545f implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(Integer.valueOf(((C21539b) ((Map.Entry) obj).getKey()).ordinal()), Integer.valueOf(((C21539b) ((Map.Entry) obj2).getKey()).ordinal()));
        }
    }

    public PopupManager(DialogManager dialogManager, FragmentManager fragmentManager, C21546a aVar) {
        C41536l.m120489i(dialogManager, "dialogManager");
        C41536l.m120489i(fragmentManager, "fragmentManager");
        C41536l.m120489i(aVar, "dismissEventPoster");
        this.f57593d = dialogManager;
        this.f57594e = fragmentManager;
        this.f57595f = aVar;
    }

    /* renamed from: j */
    private final void m69663j(C21539b bVar, C21540c cVar) {
        this.f57597h.put(bVar, cVar);
        if (this.f57597h.size() == f57592l) {
            m69669q();
        }
    }

    /* renamed from: k */
    private final void m69664k(boolean z, Dialog dialog) {
        if (z) {
            dialog.hide();
        } else {
            dialog.show();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m69665l(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m69666m(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final void m69667n(C21539b bVar) {
        m69669q();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public final void m69668o(boolean z) {
        C18394d dVar;
        Dialog n1;
        Fragment k0 = this.f57594e.mo4418k0("POST_LOGIN_ALERT");
        if (k0 instanceof C18394d) {
            dVar = (C18394d) k0;
        } else {
            dVar = null;
        }
        if (dVar != null && (n1 = dVar.mo4579n1()) != null) {
            m69664k(z, n1);
        }
    }

    /* renamed from: q */
    private final void m69669q() {
        Object obj;
        C21540c cVar;
        boolean z;
        if (this.f57599j) {
            Set entrySet = this.f57597h.entrySet();
            C41536l.m120488h(entrySet, "counterSet).entries");
            Iterator it = C41358y.m120030t0(entrySet, new C21545f()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Map.Entry) obj).getValue() != null) {
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
            Map.Entry entry = (Map.Entry) obj;
            if (entry != null && (cVar = (C21540c) entry.getValue()) != null) {
                if (!this.f57596g || cVar.mo53850a()) {
                    cVar.mo53851b(this.f57593d, this.f57594e, "POST_LOGIN_ALERT");
                    this.f57596g = true;
                    HashMap hashMap = this.f57597h;
                    Object key = entry.getKey();
                    C41536l.m120488h(key, "key");
                    hashMap.put(key, (Object) null);
                }
            }
        }
    }

    /* renamed from: i */
    public final void mo53846i(C21539b bVar, C1483c cVar, boolean z) {
        C41536l.m120489i(bVar, "id");
        m69663j(bVar, C21540c.f57621b.mo53852a(cVar, false));
    }

    @C1646z(C1593j.C1594a.ON_CREATE)
    public final void onCreate() {
        this.f57598i = new C41204a();
        C41205b F0 = this.f57595f.mo53859a().mo94987J0(C40640a.m117458b()).mo95027o0(C40992a.m118827a()).mo94981F0(new C20589a(new C21543d(this)));
        C41536l.m120488h(F0, "@OnLifecycleEvent(Lifecy…ompositeDisposable)\n    }");
        C41204a aVar = this.f57598i;
        C41204a aVar2 = null;
        if (aVar == null) {
            C41536l.m120506z("compositeDisposable");
            aVar = null;
        }
        C40397a.m116967a(F0, aVar);
        C41205b F02 = this.f57595f.mo53860b().mo94987J0(C40640a.m117458b()).mo95027o0(C40992a.m118827a()).mo94981F0(new C20590b(new C21544e(this)));
        C41536l.m120488h(F02, "@OnLifecycleEvent(Lifecy…ompositeDisposable)\n    }");
        C41204a aVar3 = this.f57598i;
        if (aVar3 == null) {
            C41536l.m120506z("compositeDisposable");
        } else {
            aVar2 = aVar3;
        }
        C40397a.m116967a(F02, aVar2);
    }

    @C1646z(C1593j.C1594a.ON_DESTROY)
    public final void onDestroy() {
        C41204a aVar = this.f57598i;
        C41204a aVar2 = null;
        if (aVar == null) {
            C41536l.m120506z("compositeDisposable");
            aVar = null;
        }
        if (!aVar.isDisposed()) {
            C41204a aVar3 = this.f57598i;
            if (aVar3 == null) {
                C41536l.m120506z("compositeDisposable");
            } else {
                aVar2 = aVar3;
            }
            aVar2.dispose();
        }
    }

    /* renamed from: p */
    public final void mo53849p(boolean z) {
        this.f57599j = z;
        if (this.f57597h.size() == f57592l) {
            m69669q();
        }
    }
}
