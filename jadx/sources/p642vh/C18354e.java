package p642vh;

import af1.C40303i;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41555e;
import p341ge.bog.designsystem.components.buttons.Button;

/* renamed from: vh.e */
public final class C18354e implements C41555e {

    /* renamed from: a */
    private final Button f51801a;

    public C18354e(Button button) {
        C41536l.m120489i(button, "button");
        this.f51801a = button;
    }

    /* renamed from: a */
    public CharSequence getValue(Object obj, C40303i iVar) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        return this.f51801a.getButtonText();
    }

    /* renamed from: b */
    public void setValue(Object obj, C40303i iVar, CharSequence charSequence) {
        C41536l.m120489i(obj, "thisRef");
        C41536l.m120489i(iVar, "property");
        this.f51801a.setButtonText(charSequence);
    }
}
