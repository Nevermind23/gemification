package dd1;

import ed1.C40762x;
import he1.C41224m;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import sso.type.StrongAuthMethod;

/* renamed from: dd1.p1 */
public final class C40578p1 {

    /* renamed from: a */
    private final C40632y1 f96193a;

    /* renamed from: dd1.p1$a */
    public /* synthetic */ class C40579a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f96194a;

        static {
            int[] iArr = new int[StrongAuthMethod.values().length];
            iArr[StrongAuthMethod.SMS.ordinal()] = 1;
            iArr[StrongAuthMethod.MAIL.ordinal()] = 2;
            f96194a = iArr;
        }
    }

    public C40578p1(C40632y1 y1Var) {
        C41536l.m120489i(y1Var, "getUserContactsUseCase");
        this.f96193a = y1Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r8 != 2) goto L_0x0057;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final he1.C41224m m117352b(java.util.List r8, sso.type.StrongAuthMethod r9) {
        /*
            r7 = this;
            boolean r0 = r8.isEmpty()
            r1 = 1
            r0 = r0 ^ r1
            r2 = 0
            if (r0 == 0) goto L_0x005b
            java.util.Iterator r8 = r8.iterator()
            r0 = r2
            r3 = r0
        L_0x000f:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0046
            java.lang.Object r4 = r8.next()
            ge.bog.sso_client.models.UserContact r4 = (p341ge.bog.sso_client.models.UserContact) r4
            sso.type.UserContactType r5 = r4.mo88424f()
            sso.type.UserContactType r6 = sso.type.UserContactType.PHONE
            if (r5 != r6) goto L_0x0030
            java.lang.Boolean r5 = r4.mo88419b()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)
            if (r5 == 0) goto L_0x0030
            r0 = r4
        L_0x0030:
            sso.type.UserContactType r5 = r4.mo88424f()
            sso.type.UserContactType r6 = sso.type.UserContactType.MAIL
            if (r5 != r6) goto L_0x000f
            java.lang.Boolean r5 = r4.mo88419b()
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r6)
            if (r5 == 0) goto L_0x000f
            r3 = r4
            goto L_0x000f
        L_0x0046:
            if (r9 != 0) goto L_0x004a
            r8 = -1
            goto L_0x0052
        L_0x004a:
            int[] r8 = dd1.C40578p1.C40579a.f96194a
            int r9 = r9.ordinal()
            r8 = r8[r9]
        L_0x0052:
            if (r8 == r1) goto L_0x0059
            r9 = 2
            if (r8 == r9) goto L_0x005c
        L_0x0057:
            r2 = r0
            goto L_0x005c
        L_0x0059:
            r3 = r2
            goto L_0x0057
        L_0x005b:
            r3 = r2
        L_0x005c:
            he1.m r8 = new he1.m
            r8.<init>(r2, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dd1.C40578p1.m117352b(java.util.List, sso.type.StrongAuthMethod):he1.m");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final C41224m m117353d(C40578p1 p1Var, StrongAuthMethod strongAuthMethod, List list) {
        C41536l.m120489i(p1Var, "this$0");
        C41536l.m120489i(list, "contacts");
        return p1Var.m117352b(list, strongAuthMethod);
    }

    /* renamed from: c */
    public final C40762x mo94596c(StrongAuthMethod strongAuthMethod) {
        C40762x A = this.f96193a.mo94634c().mo95062A(new C40571o1(this, strongAuthMethod));
        C41536l.m120488h(A, "getUserContactsUseCase()…s(contacts, authMethod) }");
        return A;
    }
}
