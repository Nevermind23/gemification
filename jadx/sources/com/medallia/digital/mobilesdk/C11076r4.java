package com.medallia.digital.mobilesdk;

/* renamed from: com.medallia.digital.mobilesdk.r4 */
public enum C11076r4 {
    select,
    end,
    delete,
    replace,
    cancel,
    ok,
    permission,
    videoTimeLimitation,
    forceDelete;

    /* renamed from: a */
    protected static C11076r4 m40632a(String str) {
        C11076r4 r4Var = select;
        if (r4Var.name().equals(str)) {
            return r4Var;
        }
        C11076r4 r4Var2 = end;
        if (r4Var2.name().equals(str)) {
            return r4Var2;
        }
        C11076r4 r4Var3 = delete;
        if (r4Var3.name().equals(str)) {
            return r4Var3;
        }
        C11076r4 r4Var4 = replace;
        if (r4Var4.name().equals(str)) {
            return r4Var4;
        }
        C11076r4 r4Var5 = cancel;
        if (r4Var5.name().equals(str)) {
            return r4Var5;
        }
        C11076r4 r4Var6 = ok;
        if (r4Var6.name().equals(str)) {
            return r4Var6;
        }
        C11076r4 r4Var7 = permission;
        if (r4Var7.name().equals(str)) {
            return r4Var7;
        }
        C11076r4 r4Var8 = videoTimeLimitation;
        if (r4Var8.name().equals(str)) {
            return r4Var8;
        }
        C11076r4 r4Var9 = forceDelete;
        if (r4Var9.name().equals(str)) {
            return r4Var9;
        }
        return null;
    }
}
