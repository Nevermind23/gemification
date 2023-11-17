package p341ge.bog.mobilebank.model.credit;

import java.util.ArrayList;
import java.util.Iterator;
import l50.C25838r;
import p341ge.bog.mobilebank.model.CreditCardDetail;

/* renamed from: ge.bog.mobilebank.model.credit.CreditCardsWrapper */
public class CreditCardsWrapper {
    private ArrayList<BillInfo> billInfo;
    private CardsContainer cardsContainer;
    private ArrayList<CreditCardDetail> details;

    public CreditCardAccount getAccountByPos(int i) {
        if (getCardsContainer() == null || getCardsContainer().getAccounts() == null || i < 0 || i >= getCardsContainer().getAccounts().size()) {
            return null;
        }
        return getCardsContainer().getAccounts().get(i);
    }

    public int getAccountPositionByAcctKey(long j) {
        if (getCardsContainer() == null || getCardsContainer().getAccounts() == null) {
            return -1;
        }
        for (int i = 0; i < getCardsContainer().getAccounts().size(); i++) {
            if (getCardsContainer().getAccounts().get(i).getAcctKey() == j) {
                return i;
            }
        }
        return -1;
    }

    public long getAcctKeyByCardId(long j) {
        if (getCardsContainer() == null || getCardsContainer().getAccounts() == null) {
            return -1;
        }
        for (int i = 0; i < getCardsContainer().getAccounts().size(); i++) {
            if (getCardsContainer().getAccounts().get(i).getAccountCreditCards() != null) {
                Iterator<C25838r> it = getCardsContainer().getAccounts().get(i).getAccountCreditCards().iterator();
                while (it.hasNext()) {
                    if (it.next().mo64582h() == j) {
                        return getCardsContainer().getAccounts().get(i).getAcctKey();
                    }
                }
                continue;
            }
        }
        return -1;
    }

    public ArrayList<BillInfo> getBillInfo() {
        return this.billInfo;
    }

    public int getCardPosByCardId(long j) {
        if (getCardsContainer() == null || getCardsContainer().getAccounts() == null) {
            return -1;
        }
        for (int i = 0; i < getCardsContainer().getAccounts().size(); i++) {
            if (getCardsContainer().getAccounts().get(i).getAccountCreditCards() != null) {
                for (int i2 = 0; i2 < getCardsContainer().getAccounts().get(i).getAccountCreditCards().size(); i2++) {
                    if (getCardsContainer().getAccounts().get(i).getAccountCreditCards().get(i2).mo64582h() == j) {
                        return i2;
                    }
                }
                continue;
            }
        }
        return -1;
    }

    public CardsContainer getCardsContainer() {
        return this.cardsContainer;
    }

    public CreditCardAccount getCreditAccountByKey(Long l) {
        if (getCardsContainer() == null || getCardsContainer().getAccounts() == null) {
            return null;
        }
        Iterator<CreditCardAccount> it = getCardsContainer().getAccounts().iterator();
        while (it.hasNext()) {
            CreditCardAccount next = it.next();
            if (next.getAcctKey() == l.longValue()) {
                return next;
            }
        }
        return null;
    }

    public ArrayList<CreditCardDetail> getDetails() {
        return this.details;
    }

    public int getRealPositionByVisiblePosition(int i) {
        if (!(getCardsContainer() == null || getCardsContainer().getAccounts() == null)) {
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < getCardsContainer().getAccounts().size(); i4++) {
                if (getCardsContainer().getAccounts().get(i4).isHidden()) {
                    i3++;
                } else if (i2 == i) {
                    return i2 + i3;
                } else {
                    i2++;
                }
            }
        }
        return 0;
    }

    public int getVisiblePositionByAcctKey(long j) {
        if (getCardsContainer() == null || getCardsContainer().getAccounts() == null) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < getCardsContainer().getAccounts().size(); i2++) {
            if (getCardsContainer().getAccounts().get(i2).getAcctKey() == j) {
                return i;
            }
            if (!getCardsContainer().getAccounts().get(i2).isHidden()) {
                i++;
            }
        }
        return i;
    }

    public void resetOperations() {
        if (getCardsContainer() != null && getCardsContainer().getAccounts() != null) {
            getCardsContainer().setAccounts((ArrayList<CreditCardAccount>) null);
        }
    }

    public void setBillInfo(ArrayList<BillInfo> arrayList) {
        this.billInfo = arrayList;
    }

    public void setCardsContainer(CardsContainer cardsContainer2) {
        this.cardsContainer = cardsContainer2;
    }

    public void setDetails(ArrayList<CreditCardDetail> arrayList) {
        this.details = arrayList;
    }
}
