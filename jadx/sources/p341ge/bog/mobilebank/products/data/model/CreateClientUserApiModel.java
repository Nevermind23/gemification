package p341ge.bog.mobilebank.products.data.model;

import androidx.annotation.Keep;
import p190o1.C7397t;

@Keep
/* renamed from: ge.bog.mobilebank.products.data.model.CreateClientUserApiModel */
public final class CreateClientUserApiModel {
    private final long userId;

    public CreateClientUserApiModel(long j) {
        this.userId = j;
    }

    public static /* synthetic */ CreateClientUserApiModel copy$default(CreateClientUserApiModel createClientUserApiModel, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = createClientUserApiModel.userId;
        }
        return createClientUserApiModel.copy(j);
    }

    public final long component1() {
        return this.userId;
    }

    public final CreateClientUserApiModel copy(long j) {
        return new CreateClientUserApiModel(j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreateClientUserApiModel) && this.userId == ((CreateClientUserApiModel) obj).userId;
    }

    public final long getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return C7397t.m28148a(this.userId);
    }

    public String toString() {
        long j = this.userId;
        return "CreateClientUserApiModel(userId=" + j + ")";
    }
}
