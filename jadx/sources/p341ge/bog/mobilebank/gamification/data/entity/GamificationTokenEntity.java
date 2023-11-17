package p341ge.bog.mobilebank.gamification.data.entity;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.mobilebank.gamification.data.entity.GamificationTokenEntity */
public final class GamificationTokenEntity {
    private final String gamificationToken;

    public GamificationTokenEntity(String str) {
        this.gamificationToken = str;
    }

    public static /* synthetic */ GamificationTokenEntity copy$default(GamificationTokenEntity gamificationTokenEntity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gamificationTokenEntity.gamificationToken;
        }
        return gamificationTokenEntity.copy(str);
    }

    public final String component1() {
        return this.gamificationToken;
    }

    public final GamificationTokenEntity copy(String str) {
        return new GamificationTokenEntity(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof GamificationTokenEntity) && C41536l.m120484d(this.gamificationToken, ((GamificationTokenEntity) obj).gamificationToken);
    }

    public final String getGamificationToken() {
        return this.gamificationToken;
    }

    public int hashCode() {
        String str = this.gamificationToken;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        String str = this.gamificationToken;
        return "GamificationTokenEntity(gamificationToken=" + str + ")";
    }
}
