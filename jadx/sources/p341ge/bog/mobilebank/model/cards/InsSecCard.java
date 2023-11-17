package p341ge.bog.mobilebank.model.cards;

import hd0.C24978b;
import org.parceler.Parcel;
import p863pw.C27636n;

@Parcel
/* renamed from: ge.bog.mobilebank.model.cards.InsSecCard */
public class InsSecCard {
    long acctKey;
    String attachmentFileBase64;
    long cardId;
    String cardName;
    C24978b dgPassYN;
    String dictionaryKey;
    C24978b digipassAllow;
    C24978b insAllow;
    String insuranceId;
    String insuranceType;
    String insuranceTypeKey;
    String lastFour;
    String mobile;
    C24978b sec3D;
    C24978b secAllow;
    String subProductCode;

    public static InsSecCard transform(C27636n nVar) {
        InsSecCard insSecCard = new InsSecCard();
        insSecCard.setCardId(nVar.mo67146c());
        insSecCard.setAcctKey(nVar.mo67144a());
        insSecCard.setCardName(nVar.mo67147d());
        insSecCard.setSubProductCode(nVar.mo67164s());
        insSecCard.setLastFour(nVar.mo67159n());
        insSecCard.setDictionaryKey(nVar.mo67150f());
        insSecCard.setInsuranceId(nVar.mo67155j());
        insSecCard.setInsuranceType(nVar.mo67157l());
        insSecCard.setInsuranceTypeKey(nVar.mo67158m());
        insSecCard.setInsAllow(nVar.mo67154i());
        insSecCard.setSec3D(nVar.mo67162q());
        insSecCard.setMobile(nVar.mo67160o());
        insSecCard.setDgPassYN(nVar.mo67148e());
        insSecCard.setSecAllow(nVar.mo67163r());
        insSecCard.setDigipassAllow(nVar.mo67152h());
        insSecCard.setAttachmentFileBase64(nVar.mo67145b());
        return insSecCard;
    }

    public long getAcctKey() {
        return this.acctKey;
    }

    public String getAttachmentFileBase64() {
        return this.attachmentFileBase64;
    }

    public long getCardId() {
        return this.cardId;
    }

    public String getCardName() {
        return this.cardName;
    }

    public C24978b getDgPassYN() {
        return this.dgPassYN;
    }

    public String getDictionaryKey() {
        return this.dictionaryKey;
    }

    public C24978b getDigipassAllow() {
        return this.digipassAllow;
    }

    public C24978b getInsAllow() {
        return this.insAllow;
    }

    public String getInsuranceId() {
        return this.insuranceId;
    }

    public String getInsuranceType() {
        return this.insuranceType;
    }

    public String getInsuranceTypeKey() {
        return this.insuranceTypeKey;
    }

    public String getLastFour() {
        return this.lastFour;
    }

    public String getMobile() {
        return this.mobile;
    }

    public C24978b getSec3D() {
        return this.sec3D;
    }

    public C24978b getSecAllow() {
        return this.secAllow;
    }

    public String getSubProductCode() {
        return this.subProductCode;
    }

    public void setAcctKey(long j) {
        this.acctKey = j;
    }

    public void setAttachmentFileBase64(String str) {
        this.attachmentFileBase64 = str;
    }

    public void setCardId(long j) {
        this.cardId = j;
    }

    public void setCardName(String str) {
        this.cardName = str;
    }

    public void setDgPassYN(C24978b bVar) {
        this.dgPassYN = bVar;
    }

    public void setDictionaryKey(String str) {
        this.dictionaryKey = str;
    }

    public void setDigipassAllow(C24978b bVar) {
        this.digipassAllow = bVar;
    }

    public void setInsAllow(C24978b bVar) {
        this.insAllow = bVar;
    }

    public void setInsuranceId(String str) {
        this.insuranceId = str;
    }

    public void setInsuranceType(String str) {
        this.insuranceType = str;
    }

    public void setInsuranceTypeKey(String str) {
        this.insuranceTypeKey = str;
    }

    public void setLastFour(String str) {
        this.lastFour = str;
    }

    public void setMobile(String str) {
        this.mobile = str;
    }

    public void setSec3D(C24978b bVar) {
        this.sec3D = bVar;
    }

    public void setSecAllow(C24978b bVar) {
        this.secAllow = bVar;
    }

    public void setSubProductCode(String str) {
        this.subProductCode = str;
    }
}
