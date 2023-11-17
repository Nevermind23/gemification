package sso.type;

import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p217q2.C7833e;
import p217q2.C7835f;
import p243s2.C8106f;

public final class InputOperationProperty implements C7835f {
    private final C7833e propertyKey;
    private final C7833e propertyValue;

    public InputOperationProperty() {
        this((C7833e) null, (C7833e) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ InputOperationProperty copy$default(InputOperationProperty inputOperationProperty, C7833e eVar, C7833e eVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            eVar = inputOperationProperty.propertyKey;
        }
        if ((i & 2) != 0) {
            eVar2 = inputOperationProperty.propertyValue;
        }
        return inputOperationProperty.copy(eVar, eVar2);
    }

    public final C7833e component1() {
        return this.propertyKey;
    }

    public final C7833e component2() {
        return this.propertyValue;
    }

    public final InputOperationProperty copy(C7833e eVar, C7833e eVar2) {
        C41536l.m120489i(eVar, "propertyKey");
        C41536l.m120489i(eVar2, "propertyValue");
        return new InputOperationProperty(eVar, eVar2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputOperationProperty)) {
            return false;
        }
        InputOperationProperty inputOperationProperty = (InputOperationProperty) obj;
        return C41536l.m120484d(this.propertyKey, inputOperationProperty.propertyKey) && C41536l.m120484d(this.propertyValue, inputOperationProperty.propertyValue);
    }

    public final C7833e getPropertyKey() {
        return this.propertyKey;
    }

    public final C7833e getPropertyValue() {
        return this.propertyValue;
    }

    public int hashCode() {
        return (this.propertyKey.hashCode() * 31) + this.propertyValue.hashCode();
    }

    public C8106f marshaller() {
        C8106f.C8107a aVar = C8106f.f23262a;
        return new InputOperationProperty$marshaller$$inlined$invoke$1(this);
    }

    public String toString() {
        return "InputOperationProperty(propertyKey=" + this.propertyKey + ", propertyValue=" + this.propertyValue + ')';
    }

    public InputOperationProperty(C7833e eVar, C7833e eVar2) {
        C41536l.m120489i(eVar, "propertyKey");
        C41536l.m120489i(eVar2, "propertyValue");
        this.propertyKey = eVar;
        this.propertyValue = eVar2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InputOperationProperty(C7833e eVar, C7833e eVar2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C7833e.f22754c.mo22767a() : eVar, (i & 2) != 0 ? C7833e.f22754c.mo22767a() : eVar2);
    }
}
