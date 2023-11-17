package p341ge.bog.mobilebank.p975ui.fragments;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import g81.C32130c;
import g91.C32303f;
import g91.C32359z0;
import java.util.ArrayList;
import jg1.C41452l;
import l50.C25832l;
import l50.C25838r;
import o81.C37697c;
import p341ge.bog.mobilebank.eventbus.events.AccountOperationsEvent;
import p341ge.bog.mobilebank.eventbus.events.CardOperationsEvent;
import p341ge.bog.mobilebank.eventbus.events.CreditAccountOperationsEvent;
import p341ge.bog.mobilebank.eventbus.events.DepositOperationsEvent;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.model.credit.CreditCardAccount;
import p341ge.bog.mobilebank.model.deposits.Deposit;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: ge.bog.mobilebank.ui.fragments.c */
public class C35587c extends C35651n1 implements C37697c {

    /* renamed from: d */
    private RecyclerView f86054d;

    /* renamed from: e */
    private View f86055e;

    /* renamed from: f */
    private C32130c f86056f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C25832l f86057g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public CreditCardAccount f86058h;

    /* renamed from: i */
    private CreditAccountOperationsEvent f86059i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Deposit f86060j;

    /* renamed from: k */
    private DepositOperationsEvent f86061k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C25838r f86062l;

    /* renamed from: m */
    private String f86063m;

    /* renamed from: n */
    private Runnable f86064n = new C35588a();

    /* renamed from: ge.bog.mobilebank.ui.fragments.c$a */
    class C35588a implements Runnable {
        C35588a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x00b7 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r18 = this;
                r0 = r18
                ge.bog.mobilebank.ui.fragments.c r1 = p341ge.bog.mobilebank.p975ui.fragments.C35587c.this
                l50.l r1 = r1.f86057g
                r2 = 6
                r3 = 0
                r4 = 0
                if (r1 == 0) goto L_0x0024
                ge.bog.mobilebank.ui.fragments.c r1 = p341ge.bog.mobilebank.p975ui.fragments.C35587c.this
                l50.l r1 = r1.f86057g
                long r5 = r1.mo64537n()
                java.lang.Long r1 = java.lang.Long.valueOf(r5)
                r5 = 1
                r9 = r1
                r10 = r3
            L_0x001e:
                r11 = r10
            L_0x001f:
                r17 = r4
                r7 = r5
                goto L_0x00b5
            L_0x0024:
                ge.bog.mobilebank.ui.fragments.c r1 = p341ge.bog.mobilebank.p975ui.fragments.C35587c.this
                ge.bog.mobilebank.model.credit.CreditCardAccount r1 = r1.f86058h
                if (r1 == 0) goto L_0x005d
                ge.bog.mobilebank.ui.fragments.c r1 = p341ge.bog.mobilebank.p975ui.fragments.C35587c.this
                ge.bog.mobilebank.model.credit.CreditCardAccount r1 = r1.f86058h
                long r5 = r1.getAcctKey()
                java.lang.Long r1 = java.lang.Long.valueOf(r5)
                ge.bog.mobilebank.ui.fragments.c r5 = p341ge.bog.mobilebank.p975ui.fragments.C35587c.this
                ge.bog.mobilebank.model.credit.CreditCardAccount r5 = r5.f86058h
                ge.bog.mobilebank.eventbus.events.CreditAccountOperationsEvent r5 = r5.getOperationsEvent()
                if (r5 == 0) goto L_0x0058
                ge.bog.mobilebank.ui.fragments.c r4 = p341ge.bog.mobilebank.p975ui.fragments.C35587c.this
                ge.bog.mobilebank.model.credit.CreditCardAccount r4 = r4.f86058h
                ge.bog.mobilebank.eventbus.events.CreditAccountOperationsEvent r4 = r4.getOperationsEvent()
                java.util.ArrayList r4 = r4.getOperations()
                int r4 = r4.size()
            L_0x0058:
                r5 = 2
            L_0x0059:
                r10 = r1
                r9 = r3
                r11 = r9
                goto L_0x001f
            L_0x005d:
                ge.bog.mobilebank.ui.fragments.c r1 = p341ge.bog.mobilebank.p975ui.fragments.C35587c.this
                ge.bog.mobilebank.model.deposits.Deposit r1 = r1.f86060j
                if (r1 == 0) goto L_0x0093
                ge.bog.mobilebank.ui.fragments.c r1 = p341ge.bog.mobilebank.p975ui.fragments.C35587c.this
                ge.bog.mobilebank.model.deposits.Deposit r1 = r1.f86060j
                long r5 = r1.getAccountKey()
                java.lang.Long r1 = java.lang.Long.valueOf(r5)
                ge.bog.mobilebank.ui.fragments.c r5 = p341ge.bog.mobilebank.p975ui.fragments.C35587c.this
                ge.bog.mobilebank.model.deposits.Deposit r5 = r5.f86060j
                ge.bog.mobilebank.eventbus.events.DepositOperationsEvent r5 = r5.getOperationsEvent()
                if (r5 == 0) goto L_0x0091
                ge.bog.mobilebank.ui.fragments.c r4 = p341ge.bog.mobilebank.p975ui.fragments.C35587c.this
                ge.bog.mobilebank.model.deposits.Deposit r4 = r4.f86060j
                ge.bog.mobilebank.eventbus.events.DepositOperationsEvent r4 = r4.getOperationsEvent()
                java.util.ArrayList r4 = r4.getOperations()
                int r4 = r4.size()
            L_0x0091:
                r5 = 4
                goto L_0x0059
            L_0x0093:
                ge.bog.mobilebank.ui.fragments.c r1 = p341ge.bog.mobilebank.p975ui.fragments.C35587c.this
                l50.r r1 = r1.f86062l
                if (r1 == 0) goto L_0x00b0
                ge.bog.mobilebank.ui.fragments.c r1 = p341ge.bog.mobilebank.p975ui.fragments.C35587c.this
                l50.r r1 = r1.f86062l
                long r5 = r1.mo64582h()
                java.lang.Long r1 = java.lang.Long.valueOf(r5)
                r11 = r1
                r7 = r2
                r9 = r3
                r10 = r9
                r17 = r4
                goto L_0x00b5
            L_0x00b0:
                r5 = -1
                r9 = r3
                r10 = r9
                goto L_0x001e
            L_0x00b5:
                if (r9 != 0) goto L_0x00bb
                if (r10 != 0) goto L_0x00bb
                if (r11 == 0) goto L_0x00d0
            L_0x00bb:
                ge.bog.mobilebank.ui.fragments.c r1 = p341ge.bog.mobilebank.p975ui.fragments.C35587c.this
                ge.bog.mobilebank.model.Client r6 = r1.mClient
                r8 = 0
                long r1 = g91.C32319m.m95306m(r2)
                java.lang.Long r12 = java.lang.Long.valueOf(r1)
                r13 = 0
                r14 = 0
                r15 = 0
                r16 = 0
                r6.requestOperations(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            L_0x00d0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.p975ui.fragments.C35587c.C35588a.run():void");
        }
    }

    /* renamed from: o1 */
    private void m105721o1() {
        ArrayList<AccountOperation> arrayList;
        int i;
        ArrayList<AccountOperation> arrayList2;
        int i2;
        int i3;
        if (getContext() != null) {
            int i4 = 8;
            this.f86055e.setVisibility(8);
            this.f86054d.setVisibility(0);
            C32130c F = C32130c.m94643F(getActivity(), false, false, this.f86063m);
            this.f86056f = F;
            F.mo90878C(this);
            if (this.f86057g != null) {
                this.f86056f.mo90877B(new ArrayList());
                this.f86056f.mo90882n();
            }
            CreditCardAccount creditCardAccount = this.f86058h;
            if (creditCardAccount != null) {
                CreditAccountOperationsEvent operationsEvent = creditCardAccount.getOperationsEvent();
                this.f86059i = operationsEvent;
                C32130c cVar = this.f86056f;
                if (operationsEvent != null) {
                    arrayList2 = operationsEvent.getOperations();
                } else {
                    arrayList2 = new ArrayList<>();
                }
                cVar.mo90877B(arrayList2);
                CreditAccountOperationsEvent creditAccountOperationsEvent = this.f86059i;
                if (creditAccountOperationsEvent != null && creditAccountOperationsEvent.getState() == 20) {
                    int size = this.f86059i.getOperations().size();
                    View view = this.f86055e;
                    if (size > 0) {
                        i2 = 8;
                    } else {
                        i2 = 0;
                    }
                    view.setVisibility(i2);
                    RecyclerView recyclerView = this.f86054d;
                    if (size > 0) {
                        i3 = 0;
                    } else {
                        i3 = 8;
                    }
                    recyclerView.setVisibility(i3);
                }
                CreditAccountOperationsEvent creditAccountOperationsEvent2 = this.f86059i;
                if (creditAccountOperationsEvent2 == null) {
                    this.f86056f.mo90882n();
                } else if (creditAccountOperationsEvent2.canDownloadMore()) {
                    this.f86056f.mo90882n();
                    if (this.f86059i.getState() == 10 || this.f86059i.getState() == 20) {
                        this.f86056f.mo90879D(true);
                    } else {
                        this.f86056f.mo90879D(false);
                    }
                } else {
                    this.f86056f.mo90881m();
                }
            }
            if (this.f86062l != null) {
                this.f86056f.mo90877B(new ArrayList());
                this.f86056f.mo90882n();
            }
            Deposit deposit = this.f86060j;
            if (deposit != null) {
                DepositOperationsEvent operationsEvent2 = deposit.getOperationsEvent();
                this.f86061k = operationsEvent2;
                C32130c cVar2 = this.f86056f;
                if (operationsEvent2 != null) {
                    arrayList = operationsEvent2.getOperations();
                } else {
                    arrayList = new ArrayList<>();
                }
                cVar2.mo90877B(arrayList);
                DepositOperationsEvent depositOperationsEvent = this.f86061k;
                if (depositOperationsEvent != null && depositOperationsEvent.getState() == 20) {
                    int size2 = this.f86061k.getOperations().size();
                    View view2 = this.f86055e;
                    if (size2 > 0) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    view2.setVisibility(i);
                    RecyclerView recyclerView2 = this.f86054d;
                    if (size2 > 0) {
                        i4 = 0;
                    }
                    recyclerView2.setVisibility(i4);
                }
                DepositOperationsEvent depositOperationsEvent2 = this.f86061k;
                if (depositOperationsEvent2 == null) {
                    this.f86056f.mo90882n();
                } else if (depositOperationsEvent2.canDownloadMore()) {
                    this.f86056f.mo90882n();
                    if (this.f86061k.getState() == 10 || this.f86061k.getState() == 20) {
                        this.f86056f.mo90879D(true);
                    } else {
                        this.f86056f.mo90879D(false);
                    }
                } else {
                    this.f86056f.mo90881m();
                }
            }
            this.f86059i = null;
            this.f86061k = null;
            this.f86054d.setAdapter(this.f86056f);
            C32359z0.m95582n(this.f86054d, "SCREEN_TYPE_OPERATION_TIPPER", this.mPreferencesApiManager);
        }
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_account_operations;
    }

    /* renamed from: m1 */
    public void mo86658m1(CreditCardAccount creditCardAccount) {
        this.f86058h = creditCardAccount;
        this.f86063m = "credit_cards";
        m105721o1();
    }

    /* renamed from: n1 */
    public void mo86659n1(C25832l lVar) {
        this.f86057g = lVar;
        this.f86063m = "accounts";
        m105721o1();
    }

    @C41452l
    public void onAccountOperationsEvent(AccountOperationsEvent accountOperationsEvent) {
        if (this.f86057g != null && accountOperationsEvent.getAcctKey() == this.f86057g.mo64529g()) {
            this.f86055e.setVisibility(8);
            this.f86054d.setVisibility(0);
            int state = accountOperationsEvent.getState();
            if (state == 10) {
                this.f86056f.mo90879D(true);
            } else if (state == 20) {
                this.f86056f.mo90877B(accountOperationsEvent.getOperations());
                if (!accountOperationsEvent.canDownloadMore()) {
                    this.f86056f.mo90881m();
                }
                this.f86056f.mo90876A();
                if (accountOperationsEvent.getOperations().size() == 0) {
                    this.f86055e.setVisibility(0);
                    this.f86054d.setVisibility(8);
                }
            } else if (state == 30 || state == 40) {
                this.f86056f.mo90879D(false);
                this.f86056f.mo90876A();
            }
        }
    }

    @C41452l
    public void onCardOperationsEvent(CardOperationsEvent cardOperationsEvent) {
        if (this.f86062l != null && cardOperationsEvent.getCardId() == this.f86062l.mo64582h()) {
            this.f86055e.setVisibility(8);
            this.f86054d.setVisibility(0);
            int state = cardOperationsEvent.getState();
            if (state == 10) {
                this.f86056f.mo90879D(true);
            } else if (state == 20) {
                this.f86056f.mo90877B(cardOperationsEvent.getOperations());
                if (!cardOperationsEvent.canDownloadMore()) {
                    this.f86056f.mo90881m();
                }
                this.f86056f.mo90876A();
                if (cardOperationsEvent.getOperations().size() == 0) {
                    this.f86055e.setVisibility(0);
                    this.f86054d.setVisibility(8);
                }
            } else if (state == 30 || state == 40) {
                this.f86056f.mo90879D(false);
                this.f86056f.mo90876A();
            }
        }
    }

    @C41452l
    public void onCreditAccountOperationsEvent(CreditAccountOperationsEvent creditAccountOperationsEvent) {
        if (this.f86058h != null && creditAccountOperationsEvent.getAcctKey() == this.f86058h.getAcctKey() && this.f86059i != creditAccountOperationsEvent) {
            this.f86059i = creditAccountOperationsEvent;
            this.f86055e.setVisibility(8);
            this.f86054d.setVisibility(0);
            int state = this.f86059i.getState();
            if (state == 10) {
                this.f86056f.mo90879D(true);
            } else if (state == 20) {
                this.f86056f.mo90877B(creditAccountOperationsEvent.getOperations());
                if (!this.f86059i.canDownloadMore()) {
                    this.f86056f.mo90881m();
                }
                this.f86056f.mo90876A();
                if (creditAccountOperationsEvent.getOperations().size() == 0) {
                    this.f86055e.setVisibility(0);
                    this.f86054d.setVisibility(8);
                }
            } else if (state == 30 || state == 40) {
                this.f86056f.mo90879D(false);
                this.f86056f.mo90876A();
            }
        }
    }

    @C41452l
    public void onDepositOperationsEvent(DepositOperationsEvent depositOperationsEvent) {
        if (this.f86060j != null && depositOperationsEvent.getAcctKey() == this.f86060j.getAccountKey() && this.f86061k != depositOperationsEvent) {
            this.f86061k = depositOperationsEvent;
            this.f86055e.setVisibility(8);
            this.f86054d.setVisibility(0);
            int state = this.f86061k.getState();
            if (state == 10) {
                this.f86056f.mo90879D(true);
            } else if (state == 20) {
                this.f86056f.mo90877B(depositOperationsEvent.getOperations());
                if (!this.f86061k.canDownloadMore()) {
                    this.f86056f.mo90881m();
                }
                this.f86056f.mo90876A();
                if (depositOperationsEvent.getOperations().size() == 0) {
                    this.f86055e.setVisibility(0);
                    this.f86054d.setVisibility(8);
                }
            } else if (state == 30 || state == 40) {
                this.f86056f.mo90879D(false);
                this.f86056f.mo90876A();
            }
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C32130c cVar;
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 10016 && C32303f.m95190a(iArr) && (cVar = this.f86056f) != null) {
            cVar.mo72617H();
        }
    }

    public void onStart() {
        super.onStart();
        this.mEventBus.mo96185q(this);
        if (this.f86057g != null || this.f86058h != null || this.f86060j != null || this.f86062l != null) {
            m105721o1();
        }
    }

    public void onStop() {
        super.onStop();
        this.mEventBus.mo96186s(this);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f86054d = (RecyclerView) view.findViewById(C10322k.f28800V);
        this.f86055e = view.findViewById(C10322k.f28798Um);
        this.f86054d.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
    }

    /* renamed from: z */
    public void mo86390z() {
        if (this.f86057g != null || this.f86058h != null || this.f86060j != null || this.f86062l != null) {
            this.f86064n.run();
        }
    }
}
