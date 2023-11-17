package p503lg;

import android.view.View;
import java.util.List;
import p341ge.bog.chat.presentation.holders.CustomIncomingMessageViewHolder;

/* renamed from: lg.g */
public final /* synthetic */ class C16567g implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ CustomIncomingMessageViewHolder f46729d;

    /* renamed from: e */
    public final /* synthetic */ List f46730e;

    public /* synthetic */ C16567g(CustomIncomingMessageViewHolder customIncomingMessageViewHolder, List list) {
        this.f46729d = customIncomingMessageViewHolder;
        this.f46730e = list;
    }

    public final void onClick(View view) {
        CustomIncomingMessageViewHolder.m49307s(this.f46729d, this.f46730e, view);
    }
}
