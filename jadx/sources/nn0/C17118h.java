package nn0;

import an0.C10107c;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.C1819o;
import en0.C12722h;
import en0.C12723i;
import en0.C12724j;
import g91.C32343x;
import hn0.C15542g;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import o31.C37626z;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.radiobutton.RadioButtonView;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: nn0.h */
public final class C17118h extends C1819o {

    /* renamed from: f */
    private final C43075l f47928f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C43075l f47929g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C43075l f47930h;

    /* renamed from: i */
    private final C43064a f47931i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f47932j = "";

    /* renamed from: k */
    private String f47933k = "";
    /* access modifiers changed from: private */

    /* renamed from: l */
    public String f47934l = "";

    /* renamed from: m */
    private int f47935m = -1;

    /* renamed from: n */
    private final C17120b f47936n = new C17120b();

    /* renamed from: o */
    private final C17119a f47937o = new C17119a();

    /* renamed from: nn0.h$a */
    public final class C17119a implements TextWatcher {
        public C17119a() {
        }

        public void afterTextChanged(Editable editable) {
            C17118h.this.f47934l = String.valueOf(editable);
            C17118h.this.f47930h.invoke(C17118h.this.f47934l);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: nn0.h$b */
    public final class C17120b implements TextWatcher {
        public C17120b() {
        }

        public void afterTextChanged(Editable editable) {
            C17118h.this.f47932j = String.valueOf(editable);
            C17118h.this.f47929g.invoke(C17118h.this.f47932j);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17118h(C43075l lVar, C43075l lVar2, C43075l lVar3, C43064a aVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(lVar, "onSelected");
        C41536l.m120489i(lVar2, "onEmployerChange");
        C41536l.m120489i(lVar3, "onBusinessNameChange");
        C41536l.m120489i(aVar, "onJobPositionClicked");
        this.f47928f = lVar;
        this.f47929g = lVar2;
        this.f47930h = lVar3;
        this.f47931i = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public static final void m60178A(C17118h hVar, View view) {
        C41536l.m120489i(hVar, "this$0");
        hVar.f47931i.invoke();
    }

    /* renamed from: C */
    private final void m60179C(int i, boolean z, boolean z2) {
        if (this.f47935m != i) {
            notifyItemChanged(m60193v());
            this.f47935m = i;
            if (z) {
                notifyItemChanged(m60193v());
            }
            if (z2) {
                this.f47928f.invoke(Integer.valueOf(this.f47935m));
            }
        }
    }

    /* renamed from: D */
    static /* synthetic */ void m60180D(C17118h hVar, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        hVar.m60179C(i, z, z2);
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static final void m60181F(C17118h hVar, String str, String str2, String str3, int i) {
        int i2;
        C41536l.m120489i(hVar, "this$0");
        C41536l.m120489i(str, "$employerName");
        C41536l.m120489i(str2, "$jobPosition");
        C41536l.m120489i(str3, "$businessName");
        List f = hVar.mo6026f();
        C41536l.m120488h(f, "currentList");
        Iterator it = f.iterator();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i2 = -1;
            if (!it.hasNext()) {
                i4 = -1;
                break;
            } else if (((C15542g) it.next()).mo42688c()) {
                break;
            } else {
                i4++;
            }
        }
        if (!C41536l.m120484d(hVar.f47932j, str)) {
            hVar.f47932j = str;
            hVar.notifyItemChanged(i4);
        }
        if (!C41536l.m120484d(hVar.f47933k, str2)) {
            hVar.f47933k = str2;
            hVar.notifyItemChanged(i4);
        }
        if (!C41536l.m120484d(hVar.f47934l, str3)) {
            hVar.f47934l = str3;
            List f2 = hVar.mo6026f();
            C41536l.m120488h(f2, "currentList");
            Iterator it2 = f2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                } else if (((C15542g) it2.next()).mo42689d()) {
                    i2 = i3;
                    break;
                } else {
                    i3++;
                }
            }
            hVar.notifyItemChanged(i2);
        }
        m60180D(hVar, i, true, false, 4, (Object) null);
    }

    /* renamed from: v */
    private final int m60193v() {
        boolean z;
        List<C15542g> f = mo6026f();
        C41536l.m120488h(f, "currentList");
        int i = 0;
        for (C15542g b : f) {
            if (b.mo42687b() == this.f47935m) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final void m60194x(C17118h hVar, C15542g gVar, C12722h hVar2, View view) {
        C41536l.m120489i(hVar, "this$0");
        C41536l.m120489i(hVar2, "$this_with");
        m60180D(hVar, gVar.mo42687b(), false, true, 2, (Object) null);
        hVar2.f37646e.setChecked(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static final void m60195y(C17118h hVar, C15542g gVar, C12724j jVar, View view) {
        C41536l.m120489i(hVar, "this$0");
        C41536l.m120489i(jVar, "$this_with");
        m60180D(hVar, gVar.mo42687b(), false, true, 2, (Object) null);
        jVar.f37655f.f37646e.setChecked(true);
        Input input = jVar.f37654e;
        C41536l.m120488h(input, "businessNameInput");
        C32343x.m95483r1(input, true, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final void m60196z(C17118h hVar, C15542g gVar, C12723i iVar, View view) {
        C41536l.m120489i(hVar, "this$0");
        C41536l.m120489i(iVar, "$this_with");
        m60180D(hVar, gVar.mo42687b(), false, true, 2, (Object) null);
        iVar.f37650f.f37646e.setChecked(true);
        Group group = iVar.f37651g;
        C41536l.m120488h(group, "inputGroup");
        C32343x.m95483r1(group, true, false, 2, (Object) null);
    }

    /* renamed from: B */
    public C37626z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == C10107c.item_occupation) {
            return new C37626z(C12722h.m48282d(from, viewGroup, false));
        }
        if (i == C10107c.item_occupation_employed) {
            return new C37626z(C12723i.m48286d(from, viewGroup, false));
        }
        if (i == C10107c.item_occupation_personal_bussiness) {
            return new C37626z(C12724j.m48290d(from, viewGroup, false));
        }
        throw new IllegalStateException(("Unknown viewType: " + i).toString());
    }

    /* renamed from: E */
    public final void mo44533E(List list, String str, String str2, String str3, int i) {
        C41536l.m120489i(list, "items");
        C41536l.m120489i(str, "employerName");
        C41536l.m120489i(str2, "jobPosition");
        C41536l.m120489i(str3, "businessName");
        mo6030j(list, new C17113c(this, str, str2, str3, i));
    }

    public int getItemViewType(int i) {
        C15542g gVar = (C15542g) mo6027g(i);
        if (gVar.mo42689d()) {
            return C10107c.item_occupation_personal_bussiness;
        }
        if (gVar.mo42688c()) {
            return C10107c.item_occupation_employed;
        }
        return C10107c.item_occupation;
    }

    /* renamed from: w */
    public void onBindViewHolder(C37626z zVar, int i) {
        C41536l.m120489i(zVar, "holder");
        C15542g gVar = (C15542g) mo6027g(i);
        C6201a h = zVar.mo90806h();
        boolean z = true;
        if (h instanceof C12724j) {
            C12724j jVar = (C12724j) h;
            if (gVar.mo42687b() != this.f47935m) {
                z = false;
            }
            jVar.f37655f.mo3946b().setOnClickListener(new C17114d(this, gVar, jVar));
            jVar.f37655f.f37647f.setText(gVar.mo42686a());
            jVar.f37655f.f37646e.setChecked(z);
            Input input = jVar.f37654e;
            C41536l.m120488h(input, "businessNameInput");
            C32343x.m95483r1(input, z, false, 2, (Object) null);
            jVar.f37654e.getTextInput().removeTextChangedListener(this.f47937o);
            jVar.f37654e.setInputText(this.f47934l);
            jVar.f37654e.getTextInput().addTextChangedListener(this.f47937o);
            jVar.f37654e.getTextInput().setImeOptions(6);
        } else if (h instanceof C12723i) {
            C12723i iVar = (C12723i) h;
            if (gVar.mo42687b() != this.f47935m) {
                z = false;
            }
            iVar.f37650f.mo3946b().setOnClickListener(new C17115e(this, gVar, iVar));
            iVar.f37650f.f37647f.setText(gVar.mo42686a());
            iVar.f37650f.f37646e.setChecked(z);
            Group group = iVar.f37651g;
            C41536l.m120488h(group, "inputGroup");
            C32343x.m95483r1(group, z, false, 2, (Object) null);
            iVar.f37649e.getTextInput().removeTextChangedListener(this.f47936n);
            iVar.f37649e.setInputText(this.f47932j);
            iVar.f37649e.getTextInput().addTextChangedListener(this.f47936n);
            iVar.f37649e.getTextInput().setImeOptions(6);
            iVar.f37652h.setInputText(this.f47933k);
            iVar.f37652h.setOnClickListener(new C17116f(this));
        } else if (h instanceof C12722h) {
            C12722h hVar = (C12722h) h;
            hVar.mo3946b().setOnClickListener(new C17117g(this, gVar, hVar));
            hVar.f37647f.setText(gVar.mo42686a());
            RadioButtonView radioButtonView = hVar.f37646e;
            if (gVar.mo42687b() != this.f47935m) {
                z = false;
            }
            radioButtonView.setChecked(z);
        }
    }
}
