package p341ge.bog.mobilebank.shared2.serverstatus.data.network.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.shared2.serverstatus.data.network.model.ServerStatusApiModel */
public final class ServerStatusApiModel {
    private final boolean mustUpdateClient;
    private final String mustUpdateClientDesc;
    private final String serverStatus;
    private final String serverStatusDesc;
    private final long serverTime;

    public ServerStatusApiModel() {
        this((String) null, (String) null, false, (String) null, 0, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ServerStatusApiModel copy$default(ServerStatusApiModel serverStatusApiModel, String str, String str2, boolean z, String str3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = serverStatusApiModel.serverStatus;
        }
        if ((i & 2) != 0) {
            str2 = serverStatusApiModel.serverStatusDesc;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            z = serverStatusApiModel.mustUpdateClient;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            str3 = serverStatusApiModel.mustUpdateClientDesc;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            j = serverStatusApiModel.serverTime;
        }
        return serverStatusApiModel.copy(str, str4, z2, str5, j);
    }

    public final String component1() {
        return this.serverStatus;
    }

    public final String component2() {
        return this.serverStatusDesc;
    }

    public final boolean component3() {
        return this.mustUpdateClient;
    }

    public final String component4() {
        return this.mustUpdateClientDesc;
    }

    public final long component5() {
        return this.serverTime;
    }

    public final ServerStatusApiModel copy(String str, String str2, boolean z, String str3, long j) {
        return new ServerStatusApiModel(str, str2, z, str3, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServerStatusApiModel)) {
            return false;
        }
        ServerStatusApiModel serverStatusApiModel = (ServerStatusApiModel) obj;
        return C41536l.m120484d(this.serverStatus, serverStatusApiModel.serverStatus) && C41536l.m120484d(this.serverStatusDesc, serverStatusApiModel.serverStatusDesc) && this.mustUpdateClient == serverStatusApiModel.mustUpdateClient && C41536l.m120484d(this.mustUpdateClientDesc, serverStatusApiModel.mustUpdateClientDesc) && this.serverTime == serverStatusApiModel.serverTime;
    }

    public final boolean getMustUpdateClient() {
        return this.mustUpdateClient;
    }

    public final String getMustUpdateClientDesc() {
        return this.mustUpdateClientDesc;
    }

    public final String getServerStatus() {
        return this.serverStatus;
    }

    public final String getServerStatusDesc() {
        return this.serverStatusDesc;
    }

    public final long getServerTime() {
        return this.serverTime;
    }

    public int hashCode() {
        String str = this.serverStatus;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.serverStatusDesc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z = this.mustUpdateClient;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        String str3 = this.mustUpdateClientDesc;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((i2 + i) * 31) + C7397t.m28148a(this.serverTime);
    }

    public String toString() {
        String str = this.serverStatus;
        String str2 = this.serverStatusDesc;
        boolean z = this.mustUpdateClient;
        String str3 = this.mustUpdateClientDesc;
        long j = this.serverTime;
        return "ServerStatusApiModel(serverStatus=" + str + ", serverStatusDesc=" + str2 + ", mustUpdateClient=" + z + ", mustUpdateClientDesc=" + str3 + ", serverTime=" + j + ")";
    }

    public ServerStatusApiModel(String str, String str2, boolean z, String str3, long j) {
        this.serverStatus = str;
        this.serverStatusDesc = str2;
        this.mustUpdateClient = z;
        this.mustUpdateClientDesc = str3;
        this.serverTime = j;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ServerStatusApiModel(java.lang.String r4, java.lang.String r5, boolean r6, java.lang.String r7, long r8, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r3 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r4
        L_0x0008:
            r4 = r10 & 2
            if (r4 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r5
        L_0x000f:
            r4 = r10 & 4
            if (r4 == 0) goto L_0x0014
            r6 = 0
        L_0x0014:
            r2 = r6
            r4 = r10 & 8
            if (r4 == 0) goto L_0x001a
            goto L_0x001b
        L_0x001a:
            r0 = r7
        L_0x001b:
            r4 = r10 & 16
            if (r4 == 0) goto L_0x0021
            r8 = 0
        L_0x0021:
            r9 = r8
            r4 = r3
            r5 = r11
            r6 = r1
            r7 = r2
            r8 = r0
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.shared2.serverstatus.data.network.model.ServerStatusApiModel.<init>(java.lang.String, java.lang.String, boolean, java.lang.String, long, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
