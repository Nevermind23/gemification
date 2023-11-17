package org.webrtc;

import java.util.Arrays;
import xh1.C43321o;

public class IceCandidate {

    /* renamed from: a */
    public final String f98815a;

    /* renamed from: b */
    public final int f98816b;

    /* renamed from: c */
    public final String f98817c;

    /* renamed from: d */
    public final String f98818d = "";

    /* renamed from: e */
    public final C43321o f98819e = C43321o.UNKNOWN;

    public IceCandidate(String str, int i, String str2) {
        this.f98815a = str;
        this.f98816b = i;
        this.f98817c = str2;
    }

    /* renamed from: a */
    private static boolean m122181a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof IceCandidate)) {
            return false;
        }
        IceCandidate iceCandidate = (IceCandidate) obj;
        if (!m122181a(this.f98815a, iceCandidate.f98815a) || this.f98816b != iceCandidate.f98816b || !m122181a(this.f98817c, iceCandidate.f98817c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f98815a, Integer.valueOf(this.f98816b), this.f98817c});
    }

    public String toString() {
        return this.f98815a + ":" + this.f98816b + ":" + this.f98817c + ":" + this.f98818d + ":" + this.f98819e.toString();
    }
}
