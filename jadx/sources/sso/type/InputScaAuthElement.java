package sso.type;

import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p217q2.C7833e;
import p217q2.C7835f;
import p243s2.C8106f;

public final class InputScaAuthElement implements C7835f {
    private final C7833e additionalData;
    private final C7833e type;
    private final C7833e value;

    public InputScaAuthElement() {
        this((C7833e) null, (C7833e) null, (C7833e) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ InputScaAuthElement copy$default(InputScaAuthElement inputScaAuthElement, C7833e eVar, C7833e eVar2, C7833e eVar3, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = inputScaAuthElement.additionalData;
        }
        if ((i & 2) != 0) {
            eVar2 = inputScaAuthElement.type;
        }
        if ((i & 4) != 0) {
            eVar3 = inputScaAuthElement.value;
        }
        return inputScaAuthElement.copy(eVar, eVar2, eVar3);
    }

    public final C7833e component1() {
        return this.additionalData;
    }

    public final C7833e component2() {
        return this.type;
    }

    public final C7833e component3() {
        return this.value;
    }

    public final InputScaAuthElement copy(C7833e eVar, C7833e eVar2, C7833e eVar3) {
        C41536l.m120489i(eVar, "additionalData");
        C41536l.m120489i(eVar2, "type");
        C41536l.m120489i(eVar3, C11755a.C11756a.f34100b);
        return new InputScaAuthElement(eVar, eVar2, eVar3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputScaAuthElement)) {
            return false;
        }
        InputScaAuthElement inputScaAuthElement = (InputScaAuthElement) obj;
        return C41536l.m120484d(this.additionalData, inputScaAuthElement.additionalData) && C41536l.m120484d(this.type, inputScaAuthElement.type) && C41536l.m120484d(this.value, inputScaAuthElement.value);
    }

    public final C7833e getAdditionalData() {
        return this.additionalData;
    }

    public final C7833e getType() {
        return this.type;
    }

    public final C7833e getValue() {
        return this.value;
    }

    public int hashCode() {
        return (((this.additionalData.hashCode() * 31) + this.type.hashCode()) * 31) + this.value.hashCode();
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new InputScaAuthElement$marshaller$$inlined$invoke$1(this);
    }

    public String toString() {
        return "InputScaAuthElement(additionalData=" + this.additionalData + ", type=" + this.type + ", value=" + this.value + ')';
    }

    public InputScaAuthElement(C7833e eVar, C7833e eVar2, C7833e eVar3) {
        C41536l.m120489i(eVar, "additionalData");
        C41536l.m120489i(eVar2, "type");
        C41536l.m120489i(eVar3, C11755a.C11756a.f34100b);
        this.additionalData = eVar;
        this.type = eVar2;
        this.value = eVar3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InputScaAuthElement(C7833e eVar, C7833e eVar2, C7833e eVar3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C7833e.f22754c.mo22767a() : eVar, (i & 2) != 0 ? C7833e.f22754c.mo22767a() : eVar2, (i & 4) != 0 ? C7833e.f22754c.mo22767a() : eVar3);
    }
}
