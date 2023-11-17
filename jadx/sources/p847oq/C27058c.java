package p847oq;

import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.model.BecomeSoloApplicationDataUiModel;

/* renamed from: oq.c */
public final class C27058c {

    /* renamed from: a */
    private final int f67993a;

    /* renamed from: b */
    private final List f67994b;

    /* renamed from: c */
    private final C27056a f67995c;

    /* renamed from: d */
    private final BecomeSoloApplicationDataUiModel f67996d;

    public C27058c(int i, List list, C27056a aVar, BecomeSoloApplicationDataUiModel becomeSoloApplicationDataUiModel) {
        C41536l.m120489i(list, "wizardObjects");
        C41536l.m120489i(aVar, "inputType");
        C41536l.m120489i(becomeSoloApplicationDataUiModel, "data");
        this.f67993a = i;
        this.f67994b = list;
        this.f67995c = aVar;
        this.f67996d = becomeSoloApplicationDataUiModel;
    }

    /* renamed from: a */
    public final BecomeSoloApplicationDataUiModel mo66310a() {
        return this.f67996d;
    }

    /* renamed from: b */
    public final int mo66311b() {
        return this.f67993a;
    }

    /* renamed from: c */
    public final List mo66312c() {
        return this.f67994b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27058c)) {
            return false;
        }
        C27058c cVar = (C27058c) obj;
        return this.f67993a == cVar.f67993a && C41536l.m120484d(this.f67994b, cVar.f67994b) && this.f67995c == cVar.f67995c && C41536l.m120484d(this.f67996d, cVar.f67996d);
    }

    public int hashCode() {
        return (((((this.f67993a * 31) + this.f67994b.hashCode()) * 31) + this.f67995c.hashCode()) * 31) + this.f67996d.hashCode();
    }

    public String toString() {
        int i = this.f67993a;
        List list = this.f67994b;
        C27056a aVar = this.f67995c;
        BecomeSoloApplicationDataUiModel becomeSoloApplicationDataUiModel = this.f67996d;
        return "BecomeSoloWizardData(position=" + i + ", wizardObjects=" + list + ", inputType=" + aVar + ", data=" + becomeSoloApplicationDataUiModel + ")";
    }
}
