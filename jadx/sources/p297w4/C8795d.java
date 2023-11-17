package p297w4;

import com.facebook.C2626d;

/* renamed from: w4.d */
public enum C8795d {
    Login(0),
    Share(1),
    Message(2),
    Like(3),
    GameRequest(4),
    AppGroupCreate(5),
    AppGroupJoin(6),
    AppInvite(7),
    DeviceShare(8),
    GamingFriendFinder(9),
    GamingGroupIntegration(10),
    Referral(11);
    

    /* renamed from: d */
    private final int f24688d;

    private C8795d(int i) {
        this.f24688d = i;
    }

    /* renamed from: a */
    public int mo24226a() {
        return C2626d.m10139j() + this.f24688d;
    }
}
