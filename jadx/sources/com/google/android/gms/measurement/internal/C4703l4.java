package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C4507ye;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.l4 */
final class C4703l4 implements C4507ye {

    /* renamed from: a */
    final /* synthetic */ C4725n4 f14587a;

    C4703l4(C4725n4 n4Var) {
        this.f14587a = n4Var;
    }

    /* renamed from: a */
    public final void mo13846a(int i, String str, List list, boolean z, boolean z2) {
        C4724n3 n3Var;
        int i2 = i - 1;
        if (i2 == 0) {
            n3Var = this.f14587a.f14613a.mo14551d().mo14674q();
        } else if (i2 != 1) {
            if (i2 == 3) {
                n3Var = this.f14587a.f14613a.mo14551d().mo14679v();
            } else if (i2 != 4) {
                n3Var = this.f14587a.f14613a.mo14551d().mo14678u();
            } else if (z) {
                n3Var = this.f14587a.f14613a.mo14551d().mo14682y();
            } else if (!z2) {
                n3Var = this.f14587a.f14613a.mo14551d().mo14681x();
            } else {
                n3Var = this.f14587a.f14613a.mo14551d().mo14680w();
            }
        } else if (z) {
            n3Var = this.f14587a.f14613a.mo14551d().mo14677t();
        } else if (!z2) {
            n3Var = this.f14587a.f14613a.mo14551d().mo14676s();
        } else {
            n3Var = this.f14587a.f14613a.mo14551d().mo14675r();
        }
        int size = list.size();
        if (size == 1) {
            n3Var.mo14616b(str, list.get(0));
        } else if (size == 2) {
            n3Var.mo14617c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            n3Var.mo14615a(str);
        } else {
            n3Var.mo14618d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
