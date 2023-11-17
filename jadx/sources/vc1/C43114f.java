package vc1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10205l;
import he1.C41217g;
import he1.C41222k;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttonlist.ButtonListView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.onetimepassword.OneTimePasswordView;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.SessionUserInfo;
import p341ge.bog.sso_client.models.UserContact;
import p670xi.C18765b;
import p670xi.C18766c;
import p670xi.C18767d;
import qc1.C42253o0;
import ua1.C28649i0;
import ue1.C43064a;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: vc1.f */
public final class C43114f extends Fragment {

    /* renamed from: d */
    private C28649i0 f100572d;

    /* renamed from: e */
    private final C41217g f100573e = C41219i.m119469a(C41222k.NONE, new C43122h(this, (C41806a) null, (C43064a) null, new C43121g(this), (C43064a) null));

    /* renamed from: f */
    private final C41217g f100574f = C41219i.m119470b(new C43116b(this));

    /* renamed from: g */
    private final C41217g f100575g = C41219i.m119469a(C41222k.SYNCHRONIZED, new C43120f(this, (C41806a) null, (C43064a) null));

    /* renamed from: h */
    private final C41217g f100576h = C41219i.m119470b(new C43119e(this));

    /* renamed from: vc1.f$a */
    public /* synthetic */ class C43115a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f100577a;

        static {
            int[] iArr = new int[C18767d.values().length];
            iArr[C18767d.PHONE.ordinal()] = 1;
            iArr[C18767d.EMAIL.ordinal()] = 2;
            f100577a = iArr;
        }
    }

    /* renamed from: vc1.f$b */
    static final class C43116b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43114f f100578d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43116b(C43114f fVar) {
            super(0);
            this.f100578d = fVar;
        }

        /* renamed from: b */
        public final UserContact invoke() {
            UserContact Nw = this.f100578d.m123710s1().mo97722Nw();
            C41536l.m120486f(Nw);
            return Nw;
        }
    }

    /* renamed from: vc1.f$c */
    public static final class C43117c implements C18765b {

        /* renamed from: d */
        final /* synthetic */ C43114f f100579d;

        /* renamed from: e */
        final /* synthetic */ OneTimePasswordView f100580e;

        C43117c(C43114f fVar, OneTimePasswordView oneTimePasswordView) {
            this.f100579d = fVar;
            this.f100580e = oneTimePasswordView;
        }

        /* renamed from: n */
        public void mo46551n() {
            C42253o0.m122698rx(this.f100579d.m123710s1(), this.f100579d.m123709r1(this.f100580e.getOtpType()), (C43064a) null, 2, (Object) null);
        }
    }

    /* renamed from: vc1.f$d */
    static final class C43118d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43114f f100581d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43118d(C43114f fVar) {
            super(0);
            this.f100581d = fVar;
        }

        public final void invoke() {
            this.f100581d.m123710s1().mo97711Cw();
        }
    }

    /* renamed from: vc1.f$e */
    static final class C43119e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43114f f100582d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43119e(C43114f fVar) {
            super(0);
            this.f100582d = fVar;
        }

        /* renamed from: b */
        public final C10205l.C10206a invoke() {
            return this.f100582d.m123708q1().mo26772b(this.f100582d);
        }
    }

    /* renamed from: vc1.f$f */
    public static final class C43120f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f100583d;

        /* renamed from: e */
        final /* synthetic */ C41806a f100584e;

        /* renamed from: f */
        final /* synthetic */ C43064a f100585f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43120f(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f100583d = componentCallbacks;
            this.f100584e = aVar;
            this.f100585f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f100583d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10205l.class), this.f100584e, this.f100585f);
        }
    }

    /* renamed from: vc1.f$g */
    public static final class C43121g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f100586d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43121g(Fragment fragment) {
            super(0);
            this.f100586d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f100586d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f100586d.requireActivity());
        }
    }

    /* renamed from: vc1.f$h */
    public static final class C43122h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f100587d;

        /* renamed from: e */
        final /* synthetic */ C41806a f100588e;

        /* renamed from: f */
        final /* synthetic */ C43064a f100589f;

        /* renamed from: g */
        final /* synthetic */ C43064a f100590g;

        /* renamed from: h */
        final /* synthetic */ C43064a f100591h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43122h(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f100587d = fragment;
            this.f100588e = aVar;
            this.f100589f = aVar2;
            this.f100590g = aVar3;
            this.f100591h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f100587d, this.f100588e, this.f100589f, this.f100590g, C41520a0.m120436b(C42253o0.class), this.f100591h);
        }
    }

    /* renamed from: p1 */
    private final C10205l.C10206a m123707p1() {
        return (C10205l.C10206a) this.f100576h.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public final C10205l m123708q1() {
        return (C10205l) this.f100575g.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: ge.bog.sso_client.models.UserContact} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: ge.bog.sso_client.models.UserContact} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: ge.bog.sso_client.models.UserContact} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: ge.bog.sso_client.models.UserContact} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: ge.bog.sso_client.models.UserContact} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: ge.bog.sso_client.models.UserContact} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: ge.bog.sso_client.models.UserContact} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: r1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p341ge.bog.sso_client.models.UserContact m123709r1(p670xi.C18767d r7) {
        /*
            r6 = this;
            int[] r0 = vc1.C43114f.C43115a.f100577a
            int r7 = r7.ordinal()
            r7 = r0[r7]
            r0 = 0
            r1 = 0
            r2 = 1
            if (r7 == r2) goto L_0x003b
            r3 = 2
            if (r7 == r3) goto L_0x0011
            goto L_0x0064
        L_0x0011:
            qc1.o0 r7 = r6.m123710s1()
            java.util.List r7 = r7.mo97720Kw()
            java.util.Iterator r7 = r7.iterator()
        L_0x001d:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0038
            java.lang.Object r3 = r7.next()
            r4 = r3
            ge.bog.sso_client.models.UserContact r4 = (p341ge.bog.sso_client.models.UserContact) r4
            sso.type.UserContactType r4 = r4.mo88424f()
            sso.type.UserContactType r5 = sso.type.UserContactType.MAIL
            if (r4 != r5) goto L_0x0034
            r4 = r2
            goto L_0x0035
        L_0x0034:
            r4 = r0
        L_0x0035:
            if (r4 == 0) goto L_0x001d
            r1 = r3
        L_0x0038:
            ge.bog.sso_client.models.UserContact r1 = (p341ge.bog.sso_client.models.UserContact) r1
            goto L_0x0064
        L_0x003b:
            qc1.o0 r7 = r6.m123710s1()
            java.util.List r7 = r7.mo97720Kw()
            java.util.Iterator r7 = r7.iterator()
        L_0x0047:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0062
            java.lang.Object r3 = r7.next()
            r4 = r3
            ge.bog.sso_client.models.UserContact r4 = (p341ge.bog.sso_client.models.UserContact) r4
            sso.type.UserContactType r4 = r4.mo88424f()
            sso.type.UserContactType r5 = sso.type.UserContactType.PHONE
            if (r4 != r5) goto L_0x005e
            r4 = r2
            goto L_0x005f
        L_0x005e:
            r4 = r0
        L_0x005f:
            if (r4 == 0) goto L_0x0047
            r1 = r3
        L_0x0062:
            ge.bog.sso_client.models.UserContact r1 = (p341ge.bog.sso_client.models.UserContact) r1
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: vc1.C43114f.m123709r1(xi.d):ge.bog.sso_client.models.UserContact");
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public final C42253o0 m123710s1() {
        return (C42253o0) this.f100573e.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m123711t1(C43114f fVar, SessionUserInfo sessionUserInfo) {
        String str;
        String avatarUrl;
        C41536l.m120489i(fVar, "this$0");
        C28649i0 i0Var = fVar.f100572d;
        if (i0Var == null) {
            C41536l.m120506z("binding");
            i0Var = null;
        }
        ButtonListView buttonListView = i0Var.f72766j;
        if (sessionUserInfo == null || (str = sessionUserInfo.getUsername()) == null) {
            str = "";
        }
        buttonListView.setBottomText(str);
        if (!(sessionUserInfo == null || (avatarUrl = sessionUserInfo.getAvatarUrl()) == null)) {
            C41536l.m120488h(buttonListView, "");
            ButtonListView.m49639n(buttonListView, (Integer) null, (Drawable) null, avatarUrl, 3, (Object) null);
        }
        buttonListView.setOnButtonClicked(new C43118d(fVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m123712u1(C43114f fVar, String str) {
        boolean z;
        C41536l.m120489i(fVar, "this$0");
        if (str == null || C40439w.m117118v(str)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C28649i0 i0Var = fVar.f100572d;
            if (i0Var == null) {
                C41536l.m120506z("binding");
                i0Var = null;
            }
            i0Var.f72764h.setCodeText(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m123713v1(C43114f fVar, OneTimePasswordView oneTimePasswordView, View view) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(oneTimePasswordView, "$this_apply");
        C42253o0.m122698rx(fVar.m123710s1(), fVar.m123709r1(oneTimePasswordView.getOtpType()), (C43064a) null, 2, (Object) null);
        oneTimePasswordView.mo36276r();
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m123714x1(C43114f fVar, Button button, View view) {
        C41536l.m120489i(fVar, "this$0");
        C41536l.m120489i(button, "$this_apply");
        C28649i0 i0Var = fVar.f100572d;
        C28649i0 i0Var2 = null;
        if (i0Var == null) {
            C41536l.m120506z("binding");
            i0Var = null;
        }
        if (i0Var.f72764h.getOtpState() != C18766c.WAITING) {
            C28649i0 i0Var3 = fVar.f100572d;
            if (i0Var3 == null) {
                C41536l.m120506z("binding");
                i0Var3 = null;
            }
            if (i0Var3.f72764h.getCodeText().length() < 4) {
                C28649i0 i0Var4 = fVar.f100572d;
                if (i0Var4 == null) {
                    C41536l.m120506z("binding");
                } else {
                    i0Var2 = i0Var4;
                }
                i0Var2.f72764h.mo36272n();
                return;
            }
            button.setLoading(true);
            C42253o0 s1 = fVar.m123710s1();
            C28649i0 i0Var5 = fVar.f100572d;
            if (i0Var5 == null) {
                C41536l.m120506z("binding");
            } else {
                i0Var2 = i0Var5;
            }
            s1.mo97712Dw(i0Var2.f72764h.getCodeText());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public static final void m123715y1(C43114f fVar, C35947l lVar) {
        C41536l.m120489i(fVar, "this$0");
        C28649i0 i0Var = fVar.f100572d;
        if (i0Var == null) {
            C41536l.m120506z("binding");
            i0Var = null;
        }
        i0Var.f72767k.setLoading(false);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C28649i0 d = C28649i0.m87701d(layoutInflater);
        C41536l.m120488h(d, "inflate(inflater)");
        this.f100572d = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        ScrollView c = d.mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onPause() {
        C28649i0 i0Var = this.f100572d;
        if (i0Var == null) {
            C41536l.m120506z("binding");
            i0Var = null;
        }
        i0Var.f72764h.clearFocus();
        super.onPause();
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0058 A[EDGE_INSN: B:85:0x0058->B:21:0x0058 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r11, android.os.Bundle r12) {
        /*
            r10 = this;
            java.lang.String r12 = "view"
            kotlin.jvm.internal.C41536l.m120489i(r11, r12)
            ua1.i0 r11 = r10.f100572d
            r12 = 0
            java.lang.String r0 = "binding"
            if (r11 != 0) goto L_0x0010
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r11 = r12
        L_0x0010:
            ge.bog.designsystem.components.onetimepassword.OneTimePasswordView r11 = r11.f72764h
            qc1.o0 r1 = r10.m123710s1()
            java.util.List r1 = r1.mo97720Kw()
            boolean r2 = r1 instanceof java.util.Collection
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0028
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0028
        L_0x0026:
            r1 = r4
            goto L_0x0046
        L_0x0028:
            java.util.Iterator r1 = r1.iterator()
        L_0x002c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0026
            java.lang.Object r2 = r1.next()
            ge.bog.sso_client.models.UserContact r2 = (p341ge.bog.sso_client.models.UserContact) r2
            sso.type.UserContactType r2 = r2.mo88424f()
            sso.type.UserContactType r5 = sso.type.UserContactType.MAIL
            if (r2 != r5) goto L_0x0042
            r2 = r3
            goto L_0x0043
        L_0x0042:
            r2 = r4
        L_0x0043:
            if (r2 == 0) goto L_0x002c
            r1 = r3
        L_0x0046:
            qc1.o0 r2 = r10.m123710s1()
            java.util.List r2 = r2.mo97720Kw()
            boolean r5 = r2 instanceof java.util.Collection
            if (r5 == 0) goto L_0x005a
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L_0x005a
        L_0x0058:
            r2 = r4
            goto L_0x0078
        L_0x005a:
            java.util.Iterator r2 = r2.iterator()
        L_0x005e:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0058
            java.lang.Object r5 = r2.next()
            ge.bog.sso_client.models.UserContact r5 = (p341ge.bog.sso_client.models.UserContact) r5
            sso.type.UserContactType r5 = r5.mo88424f()
            sso.type.UserContactType r6 = sso.type.UserContactType.PHONE
            if (r5 != r6) goto L_0x0074
            r5 = r3
            goto L_0x0075
        L_0x0074:
            r5 = r4
        L_0x0075:
            if (r5 == 0) goto L_0x005e
            r2 = r3
        L_0x0078:
            if (r2 == 0) goto L_0x0080
            if (r1 != 0) goto L_0x0080
            r11.mo36291v()
            goto L_0x0087
        L_0x0080:
            if (r1 != 0) goto L_0x0087
            if (r2 != 0) goto L_0x0087
            r11.mo36277s()
        L_0x0087:
            r11.setPhoneEnabled(r2)
            java.lang.String r5 = "Collection contains no element matching the predicate."
            java.lang.String r6 = ""
            if (r2 == 0) goto L_0x00c6
            qc1.o0 r2 = r10.m123710s1()
            java.util.List r2 = r2.mo97720Kw()
            java.util.Iterator r2 = r2.iterator()
        L_0x009c:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x00c0
            java.lang.Object r7 = r2.next()
            ge.bog.sso_client.models.UserContact r7 = (p341ge.bog.sso_client.models.UserContact) r7
            sso.type.UserContactType r8 = r7.mo88424f()
            sso.type.UserContactType r9 = sso.type.UserContactType.PHONE
            if (r8 != r9) goto L_0x00b2
            r8 = r3
            goto L_0x00b3
        L_0x00b2:
            r8 = r4
        L_0x00b3:
            if (r8 == 0) goto L_0x009c
            java.lang.String r2 = r7.mo88418a()
            if (r2 != 0) goto L_0x00bc
            r2 = r6
        L_0x00bc:
            r11.setPhoneNumber(r2)
            goto L_0x00c6
        L_0x00c0:
            java.util.NoSuchElementException r11 = new java.util.NoSuchElementException
            r11.<init>(r5)
            throw r11
        L_0x00c6:
            r11.setEmailEnabled(r1)
            if (r1 == 0) goto L_0x0101
            qc1.o0 r1 = r10.m123710s1()
            java.util.List r1 = r1.mo97720Kw()
            java.util.Iterator r1 = r1.iterator()
        L_0x00d7:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00fb
            java.lang.Object r2 = r1.next()
            ge.bog.sso_client.models.UserContact r2 = (p341ge.bog.sso_client.models.UserContact) r2
            sso.type.UserContactType r7 = r2.mo88424f()
            sso.type.UserContactType r8 = sso.type.UserContactType.MAIL
            if (r7 != r8) goto L_0x00ed
            r7 = r3
            goto L_0x00ee
        L_0x00ed:
            r7 = r4
        L_0x00ee:
            if (r7 == 0) goto L_0x00d7
            java.lang.String r1 = r2.mo88418a()
            if (r1 != 0) goto L_0x00f7
            r1 = r6
        L_0x00f7:
            r11.setEmail(r1)
            goto L_0x0101
        L_0x00fb:
            java.util.NoSuchElementException r11 = new java.util.NoSuchElementException
            r11.<init>(r5)
            throw r11
        L_0x0101:
            vc1.f$c r1 = new vc1.f$c
            r1.<init>(r10, r11)
            r11.setOneTimePasswordListener(r1)
            vc1.a r1 = new vc1.a
            r1.<init>(r10, r11)
            r11.setResendButtonClickListener(r1)
            ua1.i0 r11 = r10.f100572d
            if (r11 != 0) goto L_0x0119
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r11 = r12
        L_0x0119:
            ge.bog.designsystem.components.buttons.Button r11 = r11.f72767k
            vc1.b r1 = new vc1.b
            r1.<init>(r10, r11)
            r11.setOnClickListener(r1)
            ua1.i0 r11 = r10.f100572d
            if (r11 != 0) goto L_0x012b
            kotlin.jvm.internal.C41536l.m120506z(r0)
            goto L_0x012c
        L_0x012b:
            r12 = r11
        L_0x012c:
            ge.bog.designsystem.components.buttonlist.ButtonListView r0 = r12.f72766j
            kotlin.jvm.internal.C41536l.m120488h(r0, r6)
            r1 = 0
            android.content.Context r11 = r0.getContext()
            int r12 = ba1.C10214s.f28278a
            android.graphics.drawable.Drawable r2 = androidx.core.content.C0767a.m2895e(r11, r12)
            r3 = 0
            r4 = 5
            r5 = 0
            p341ge.bog.designsystem.components.buttonlist.ButtonListView.m49639n(r0, r1, r2, r3, r4, r5)
            qc1.o0 r11 = r10.m123710s1()
            androidx.lifecycle.LiveData r11 = r11.mo42544x0()
            androidx.lifecycle.q r12 = r10.getViewLifecycleOwner()
            vc1.c r0 = new vc1.c
            r0.<init>(r10)
            r11.mo4819k(r12, r0)
            qc1.o0 r11 = r10.m123710s1()
            androidx.lifecycle.LiveData r11 = r11.mo97721Mw()
            androidx.lifecycle.q r12 = r10.getViewLifecycleOwner()
            vc1.d r0 = new vc1.d
            r0.<init>(r10)
            r11.mo4819k(r12, r0)
            ba1.l$a r11 = r10.m123707p1()
            if (r11 == 0) goto L_0x0182
            androidx.lifecycle.LiveData r11 = r11.mo26775b()
            if (r11 == 0) goto L_0x0182
            androidx.lifecycle.q r12 = r10.getViewLifecycleOwner()
            vc1.e r0 = new vc1.e
            r0.<init>(r10)
            r11.mo4819k(r12, r0)
        L_0x0182:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vc1.C43114f.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
