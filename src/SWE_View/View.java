package SWE_View;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class View extends JFrame{

	private JLabel ueberschift = new JLabel("Bankkonto");
	private JPanel pUberschift = new JPanel();
	
	private JTextField kontoNmr = new JTextField();
	private JLabel kontoNmrText = new JLabel("Kontonummer");
	private JPanel pKontoNmr = new JPanel(new GridLayout(0,1,30,10));
	
	private JTextField sachBearbeiter = new JTextField();
	private JLabel sachBearbeiterText = new JLabel("Sachbearbeiter");
	private JPanel pSachBearbeiter = new JPanel(new GridLayout(0,1,30,10));
	
	private JTextField kontoStand = new JTextField();
	private JLabel kontoStandText = new JLabel("Kontostand");
	private JPanel pKontoStand = new JPanel(new GridLayout(0,1,30,10));
	
	private JTextField buchungsBetrag = new JTextField();
	private JLabel buchungsBetragText = new JLabel("Buchungsbetrag");
	private JPanel pBuchungsBetrag = new JPanel(new GridLayout(0,1,30,10));
	
	private JTextField statusZeile = new JTextField();
	private JLabel statusZeileText = new JLabel("Statuszeile");
	private JPanel pStatusZeile = new JPanel(new GridLayout(0,1,30,10));
	
	private JButton ok = new JButton("Ok");
	private JPanel pOk = new JPanel();
	
	private JButton abbrechen = new JButton("Abbrechen");
	private JPanel pAbbrechen = new JPanel();
	
	private JPanel oben = new JPanel();
	private JPanel mitte = new JPanel(new FlowLayout());
	private JPanel unten = new JPanel();
	private JPanel alles = new JPanel(new BorderLayout());

	Container cp;

	public View() {
		super();
		cp = getContentPane();
		
		pKontoNmr.add(kontoNmr);
		pKontoNmr.add(kontoNmrText);
		pSachBearbeiter.add(sachBearbeiter);
		pSachBearbeiter.add(sachBearbeiterText);
		pKontoStand.add(kontoStand);
		pKontoStand.add(kontoStandText);
		pBuchungsBetrag.add(buchungsBetrag);
		pBuchungsBetrag.add(buchungsBetragText);
		oben.add(ueberschift);
		mitte.add(pKontoNmr);
		mitte.add(pSachBearbeiter);
		mitte.add(pKontoStand);
		mitte.add(pBuchungsBetrag);
		pStatusZeile.add(statusZeile);
		pStatusZeile.add(statusZeileText);
		unten.add(pStatusZeile);
		unten.add(ok);
		unten.add(abbrechen);
		alles.add(oben, BorderLayout.NORTH);
		alles.add(mitte, BorderLayout.CENTER);
		alles.add(unten, BorderLayout.SOUTH);
		cp.add(alles, BorderLayout.CENTER);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(400, 350);
		setLocation(400, 200);
	}
	public JLabel getUeberschift() {
		return ueberschift;
	}
	public void setUeberschift(JLabel ueberschift) {
		this.ueberschift = ueberschift;
	}
	public JPanel getpUberschift() {
		return pUberschift;
	}
	public void setpUberschift(JPanel pUberschift) {
		this.pUberschift = pUberschift;
	}
	public JTextField getKontoNmr() {
		return kontoNmr;
	}
	public void setKontoNmr(JTextField kontoNmr) {
		this.kontoNmr = kontoNmr;
	}
	public JPanel getpKontoNmr() {
		return pKontoNmr;
	}
	public void setpKontoNmr(JPanel pKontoNmr) {
		this.pKontoNmr = pKontoNmr;
	}
	public JLabel getKontoNmrText() {
		return kontoNmrText;
	}
	public void setKontoNmrText(JLabel kontoNmrText) {
		this.kontoNmrText = kontoNmrText;
	}
	public JTextField getSachBearbeiter() {
		return sachBearbeiter;
	}
	public void setSachBearbeiter(JTextField sachBearbeiter) {
		this.sachBearbeiter = sachBearbeiter;
	}
	public JLabel getSachBearbeiterText() {
		return sachBearbeiterText;
	}
	public void setSachBearbeiterText(JLabel sachBearbeiterText) {
		this.sachBearbeiterText = sachBearbeiterText;
	}
	public JPanel getpSachBearbeiter() {
		return pSachBearbeiter;
	}
	public void setpSachBearbeiter(JPanel pSachBearbeiter) {
		this.pSachBearbeiter = pSachBearbeiter;
	}
	public JTextField getKontoStand() {
		return kontoStand;
	}
	public void setKontoStand(JTextField kontoStand) {
		this.kontoStand = kontoStand;
	}
	public JLabel getKontoStandText() {
		return kontoStandText;
	}
	public void setKontoStandText(JLabel kontoStandText) {
		this.kontoStandText = kontoStandText;
	}
	public JTextField getBuchungsBetrag() {
		return buchungsBetrag;
	}
	public void setBuchungsBetrag(JTextField buchungsBetrag) {
		this.buchungsBetrag = buchungsBetrag;
	}
	public JLabel getBuchungsBetragText() {
		return buchungsBetragText;
	}
	public void setBuchungsBetragText(JLabel buchungsBetragText) {
		this.buchungsBetragText = buchungsBetragText;
	}
	public JTextField getStatusZeile() {
		return statusZeile;
	}
	public void setStatusZeile(JTextField statusZeile) {
		this.statusZeile = statusZeile;
	}
	public JButton getOk() {
		return ok;
	}
	public void setOk(JButton ok) {
		this.ok = ok;
	}
	public JPanel getpOk() {
		return pOk;
	}
	public void setpOk(JPanel pOk) {
		this.pOk = pOk;
	}
	public JButton getAbbrechen() {
		return abbrechen;
	}
	public void setAbbrechen(JButton abbrechen) {
		this.abbrechen = abbrechen;
	}
	public JPanel getpAbbrechen() {
		return pAbbrechen;
	}
	public void setpAbbrechen(JPanel pAbbrechen) {
		this.pAbbrechen = pAbbrechen;
	}
	public JPanel getpKontoStand() {
		return pKontoStand;
	}
	public void setpKontoStand(JPanel pKontoStand) {
		this.pKontoStand = pKontoStand;
	}
	public JPanel getpBuchungsBetrag() {
		return pBuchungsBetrag;
	}
	public void setpBuchungsBetrag(JPanel pBuchungsBetrag) {
		this.pBuchungsBetrag = pBuchungsBetrag;
	}
	public JPanel getOben() {
		return oben;
	}
	public void setOben(JPanel oben) {
		this.oben = oben;
	}
	public JPanel getMitte() {
		return mitte;
	}
	public void setMitte(JPanel mitte) {
		this.mitte = mitte;
	}
	public JPanel getUnten() {
		return unten;
	}
	public void setUnten(JPanel unten) {
		this.unten = unten;
	}
	public JPanel getAlles() {
		return alles;
	}
	public void setAlles(JPanel alles) {
		this.alles = alles;
	}
	public JLabel getStatusZeileText() {
		return statusZeileText;
	}
	public void setStatusZeileText(JLabel statusZeileText) {
		this.statusZeileText = statusZeileText;
	}
	public JPanel getpStatusZeile() {
		return pStatusZeile;
	}
	public void setpStatusZeile(JPanel pStatusZeile) {
		this.pStatusZeile = pStatusZeile;
	}
}