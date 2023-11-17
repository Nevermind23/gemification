package p341ge.bog.chatkit.messages;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.C1785g;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p573qg.C17499b;

/* renamed from: ge.bog.chatkit.messages.MessagesList */
public class MessagesList extends RecyclerView {

    /* renamed from: P0 */
    private C13117a f38546P0;

    public MessagesList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m49352P1(context, attributeSet);
    }

    /* renamed from: P1 */
    private void m49352P1(Context context, AttributeSet attributeSet) {
        this.f38546P0 = C13117a.m49358V(context, attributeSet);
    }

    /* renamed from: Q1 */
    public void mo34498Q1(MessagesListAdapter messagesListAdapter, boolean z) {
        C1785g gVar = new C1785g();
        gVar.mo6072Q(false);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 1, z);
        setItemAnimator(gVar);
        setLayoutManager(linearLayoutManager);
        messagesListAdapter.setLayoutManager(linearLayoutManager);
        messagesListAdapter.setStyle(this.f38546P0);
        mo5363n(new C13118b(linearLayoutManager, messagesListAdapter));
        super.setAdapter(messagesListAdapter);
    }

    public void setAdapter(RecyclerView.C1736h hVar) {
        throw new IllegalArgumentException("You can't set adapter to MessagesList. Use #setAdapter(MessagesListAdapter) instead.");
    }

    public <MESSAGE extends C17499b> void setAdapter(MessagesListAdapter<MESSAGE> messagesListAdapter) {
        mo34498Q1(messagesListAdapter, true);
    }
}
