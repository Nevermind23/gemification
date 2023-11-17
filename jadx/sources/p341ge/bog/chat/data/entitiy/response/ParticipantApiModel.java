package p341ge.bog.chat.data.entitiy.response;

import androidx.annotation.Keep;
import kotlin.jvm.internal.C41536l;

@Keep
/* renamed from: ge.bog.chat.data.entitiy.response.ParticipantApiModel */
public final class ParticipantApiModel {
    private final String nickname;
    private final int participantId;
    private final ParticipantTypeApiModel type;

    public ParticipantApiModel(String str, int i, ParticipantTypeApiModel participantTypeApiModel) {
        this.nickname = str;
        this.participantId = i;
        this.type = participantTypeApiModel;
    }

    public static /* synthetic */ ParticipantApiModel copy$default(ParticipantApiModel participantApiModel, String str, int i, ParticipantTypeApiModel participantTypeApiModel, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = participantApiModel.nickname;
        }
        if ((i2 & 2) != 0) {
            i = participantApiModel.participantId;
        }
        if ((i2 & 4) != 0) {
            participantTypeApiModel = participantApiModel.type;
        }
        return participantApiModel.copy(str, i, participantTypeApiModel);
    }

    public final String component1() {
        return this.nickname;
    }

    public final int component2() {
        return this.participantId;
    }

    public final ParticipantTypeApiModel component3() {
        return this.type;
    }

    public final ParticipantApiModel copy(String str, int i, ParticipantTypeApiModel participantTypeApiModel) {
        return new ParticipantApiModel(str, i, participantTypeApiModel);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParticipantApiModel)) {
            return false;
        }
        ParticipantApiModel participantApiModel = (ParticipantApiModel) obj;
        return C41536l.m120484d(this.nickname, participantApiModel.nickname) && this.participantId == participantApiModel.participantId && this.type == participantApiModel.type;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final int getParticipantId() {
        return this.participantId;
    }

    public final ParticipantTypeApiModel getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.nickname;
        int i = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.participantId) * 31;
        ParticipantTypeApiModel participantTypeApiModel = this.type;
        if (participantTypeApiModel != null) {
            i = participantTypeApiModel.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.nickname;
        int i = this.participantId;
        ParticipantTypeApiModel participantTypeApiModel = this.type;
        return "ParticipantApiModel(nickname=" + str + ", participantId=" + i + ", type=" + participantTypeApiModel + ")";
    }
}
