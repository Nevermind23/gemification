package p341ge.bog.chat.presentation.activity;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.chat.presentation.holders.CustomIncomingMessageViewHolder;
import p341ge.bog.chatkit.commons.ViewHolder;
import p341ge.bog.chatkit.messages.MessageHolders;
import p341ge.bog.chatkit.messages.MessagesListAdapter;
import p419fg.C12887l;
import p447hg.C15505g;
import p503lg.C16574l;
import ue1.C43075l;

/* renamed from: ge.bog.chat.presentation.activity.l0 */
public final class C13039l0 extends MessagesListAdapter {

    /* renamed from: h */
    public static final C13040a f38426h = new C13040a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final Object f38427i = new Object();

    /* renamed from: d */
    private C13054p0 f38428d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f38429e = -1;

    /* renamed from: f */
    private CustomIncomingMessageViewHolder.C13081b f38430f;

    /* renamed from: g */
    private C15505g f38431g;

    /* renamed from: ge.bog.chat.presentation.activity.l0$a */
    public static final class C13040a {
        private C13040a() {
        }

        public /* synthetic */ C13040a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.chat.presentation.activity.l0$b */
    public static final class C13041b extends C13054p0 {

        /* renamed from: c */
        final /* synthetic */ C13039l0 f38432c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13041b(RecyclerView recyclerView, C13039l0 l0Var) {
            super(recyclerView);
            this.f38432c = l0Var;
        }

        /* renamed from: f */
        public void mo34319f(int i, C16574l lVar) {
            C41536l.m120489i(lVar, "statusable");
            if (this.f38432c.f38429e != i) {
                this.f38432c.mo34314n();
            }
            lVar.mo34409a(!lVar.mo34410b());
            this.f38432c.notifyItemChanged(i, C13039l0.f38427i);
            this.f38432c.f38429e = i;
        }

        /* renamed from: g */
        public void mo34320g() {
            this.f38432c.mo34314n();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13039l0(MessageHolders messageHolders, C13045n0 n0Var) {
        super(C12887l.CLIENT.name(), messageHolders, n0Var);
        C41536l.m120489i(messageHolders, "holders");
        C41536l.m120489i(n0Var, "imageLoader");
    }

    public void addToEnd(List list, boolean z) {
        int i;
        List<MessagesListAdapter.C13116j> list2 = this.items;
        C41536l.m120488h(list2, "items");
        ListIterator<MessagesListAdapter.C13116j> listIterator = list2.listIterator(list2.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                if (listIterator.previous().f38552a instanceof C13034j0) {
                    i = listIterator.nextIndex();
                    break;
                }
            } else {
                i = -1;
                break;
            }
        }
        super.addToEnd(list, z);
        if (i != -1) {
            notifyItemChanged(i);
        }
    }

    /* renamed from: i */
    public final void mo34309i(C13034j0 j0Var) {
        C41536l.m120489i(j0Var, "message");
        C13034j0 p = mo34316p();
        addToStart(j0Var, true);
        if (p != null) {
            mo34311k(p);
        }
    }

    /* renamed from: j */
    public void addToStart(C13034j0 j0Var, boolean z) {
        super.addToStart(j0Var, z);
        if (this.items.size() > 1) {
            notifyItemChanged(1);
        }
    }

    /* renamed from: k */
    public final void mo34311k(C13034j0 j0Var) {
        Object obj;
        C13034j0 j0Var2;
        C41536l.m120489i(j0Var, "typingMessage");
        List<MessagesListAdapter.C13116j> list = this.items;
        C41536l.m120488h(list, "items");
        MessagesListAdapter.C13116j jVar = (MessagesListAdapter.C13116j) C41358y.m120009Y(list);
        C13032i0 i0Var = null;
        if (jVar != null) {
            obj = jVar.f38552a;
        } else {
            obj = null;
        }
        if (obj instanceof C13034j0) {
            j0Var2 = (C13034j0) obj;
        } else {
            j0Var2 = null;
        }
        if (j0Var2 != null) {
            i0Var = j0Var2.mo34300o();
        }
        if (i0Var != C13032i0.TYPING) {
            addToStart(j0Var, true);
        }
    }

    /* renamed from: l */
    public final void mo34312l(C43075l lVar) {
        C13034j0 j0Var;
        C41536l.m120489i(lVar, "forEach");
        List<MessagesListAdapter.C13116j> list = this.items;
        C41536l.m120488h(list, "items");
        for (MessagesListAdapter.C13116j jVar : list) {
            Object obj = jVar.f38552a;
            if (obj instanceof C13034j0) {
                j0Var = (C13034j0) obj;
            } else {
                j0Var = null;
            }
            lVar.invoke(j0Var);
        }
        notifyDataSetChanged();
    }

    /* renamed from: m */
    public final C13034j0 mo34313m(int i) {
        List<MessagesListAdapter.C13116j> list = this.items;
        C41536l.m120488h(list, "items");
        MessagesListAdapter.C13116j jVar = (MessagesListAdapter.C13116j) C41358y.m120010Z(list, i);
        Object obj = jVar != null ? jVar.f38552a : null;
        if (obj instanceof C13034j0) {
            return (C13034j0) obj;
        }
        return null;
    }

    /* renamed from: n */
    public final void mo34314n() {
        C16574l lVar;
        C13054p0 p0Var = this.f38428d;
        if (p0Var != null) {
            lVar = p0Var.mo34331d(this.f38429e);
        } else {
            lVar = null;
        }
        if (lVar != null) {
            lVar.mo34409a(false);
            notifyItemChanged(this.f38429e, f38427i);
        }
        this.f38429e = -1;
    }

    /* renamed from: o */
    public void onBindViewHolder(ViewHolder viewHolder, int i, List list) {
        Object obj;
        C13034j0 j0Var;
        Object obj2;
        C13034j0 j0Var2;
        C13027g0 g0Var;
        C41536l.m120489i(viewHolder, "holder");
        C41536l.m120489i(list, "payloads");
        Object obj3 = this.items.get(i).f38552a;
        List<MessagesListAdapter.C13116j> list2 = this.items;
        C41536l.m120488h(list2, "items");
        MessagesListAdapter.C13116j jVar = (MessagesListAdapter.C13116j) C41358y.m120010Z(list2, i - 1);
        C16574l lVar = null;
        if (jVar != null) {
            obj = jVar.f38552a;
        } else {
            obj = null;
        }
        if (obj instanceof C13034j0) {
            j0Var = (C13034j0) obj;
        } else {
            j0Var = null;
        }
        List<MessagesListAdapter.C13116j> list3 = this.items;
        C41536l.m120488h(list3, "items");
        MessagesListAdapter.C13116j jVar2 = (MessagesListAdapter.C13116j) C41358y.m120010Z(list3, i + 1);
        if (jVar2 != null) {
            obj2 = jVar2.f38552a;
        } else {
            obj2 = null;
        }
        if (obj2 instanceof C13034j0) {
            j0Var2 = (C13034j0) obj2;
        } else {
            j0Var2 = null;
        }
        if (obj3 instanceof C13034j0) {
            C13034j0 j0Var3 = (C13034j0) obj3;
            if (!j0Var3.mo34288e(j0Var2) && !j0Var3.mo34288e(j0Var)) {
                g0Var = C13027g0.NO_GROUP;
            } else if (!j0Var3.mo34288e(j0Var2)) {
                g0Var = C13027g0.FIRST_MESSAGE;
            } else if (!j0Var3.mo34288e(j0Var)) {
                g0Var = C13027g0.LAST_MESSAGE;
            } else {
                g0Var = C13027g0.MIDDLE_MESSAGE;
            }
            j0Var3.mo34305t(g0Var);
            if (viewHolder instanceof CustomIncomingMessageViewHolder) {
                CustomIncomingMessageViewHolder customIncomingMessageViewHolder = (CustomIncomingMessageViewHolder) viewHolder;
                customIncomingMessageViewHolder.mo34406I(this.f38430f);
                customIncomingMessageViewHolder.mo34408M(this.f38431g);
            }
        }
        if (viewHolder instanceof C16574l) {
            lVar = (C16574l) viewHolder;
        }
        if (lVar != null) {
            lVar.mo34411c(list.contains(f38427i));
        }
        super.onBindViewHolder(viewHolder, i, list);
        if (lVar != null) {
            lVar.mo34411c(false);
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C41536l.m120489i(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        C13041b bVar = new C13041b(recyclerView, this);
        this.f38428d = bVar;
        bVar.mo34332h();
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C41536l.m120489i(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        C13054p0 p0Var = this.f38428d;
        if (p0Var != null) {
            p0Var.mo34333i();
        }
        this.f38428d = null;
    }

    /* renamed from: p */
    public final C13034j0 mo34316p() {
        Object obj;
        C13034j0 j0Var;
        C13032i0 i0Var;
        List<MessagesListAdapter.C13116j> list = this.items;
        C41536l.m120488h(list, "items");
        MessagesListAdapter.C13116j jVar = (MessagesListAdapter.C13116j) C41358y.m120009Y(list);
        if (jVar != null) {
            obj = jVar.f38552a;
        } else {
            obj = null;
        }
        if (obj instanceof C13034j0) {
            j0Var = (C13034j0) obj;
        } else {
            j0Var = null;
        }
        if (j0Var != null) {
            i0Var = j0Var.mo34300o();
        } else {
            i0Var = null;
        }
        if (i0Var != C13032i0.TYPING) {
            return null;
        }
        delete(j0Var);
        notifyItemChanged(0);
        return j0Var;
    }

    /* renamed from: q */
    public final void mo34317q(CustomIncomingMessageViewHolder.C13081b bVar) {
        this.f38430f = bVar;
    }

    /* renamed from: r */
    public final void mo34318r(C15505g gVar) {
        this.f38431g = gVar;
    }
}
