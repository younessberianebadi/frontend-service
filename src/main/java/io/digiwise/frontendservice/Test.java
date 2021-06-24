package io.digiwise.frontendservice;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;


public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    private int id_player;

    private String comment;

    private float confiance_en_soi;

    private float gout_de_l_effort;

    private float concentration;

    private float application;

    private float joueur_equipier;

    private float orientation_du_corps;

    private float jonglage;

    private float conduite_de_balle;

    private float dribbles_et_feintes;

    private float protection_de_ballon;

    private float premiere_touche;

    private float controles_orientes;

    private float controles_aeriens;

    private float passes_courtes;

    private float passes_moyennes;

    private float passes_longues;

    private float centres;

    private float volee;

    private float tirs;

    private float jeu_de_tete;

    private float pied_faible;

    private float x_1_vs_1;

    private float vision_de_jeu;

    private float creativite_et_prise_d_initiatives;

    private float placement;

    private float deplacement;

    private float attitude_a_la_perte_de_balle;

    private float mise_en_pratique_des_principes_de_zone;

    private float anticipation;

    private float replacement;

    private float motricite;

    private float vivacite;

    private float vitesse;

    private float endurance;

    private float puissance;

    private float souplesse;


    public Test(){
        super();
    }

    public Test(Long id, LocalDate date, int id_player, String comment, float confiance_en_soi, float gout_de_l_effort, float concentration, float application, float joueur_equipier, float orientation_du_corps, float jonglage, float conduite_de_balle, float dribbles_et_feintes, float protection_de_ballon, float premiere_touche, float controles_orientes, float controles_aeriens, float passes_courtes, float passes_moyennes, float passes_longues, float centres, float volee, float tirs, float jeu_de_tete, float pied_faible, float x_1_vs_1, float vision_de_jeu, float creativite_et_prise_d_initiatives, float placement, float deplacement, float attitude_a_la_perte_de_balle, float mise_en_pratique_des_principes_de_zone, float anticipation, float replacement, float motricite, float vivacite, float vitesse, float endurance, float puissance, float souplesse) {
        super();
        this.id = id;
        this.date = date;
        this.id_player = id_player;
        this.comment = comment;
        this.confiance_en_soi = confiance_en_soi;
        this.gout_de_l_effort = gout_de_l_effort;
        this.concentration = concentration;
        this.application = application;
        this.joueur_equipier = joueur_equipier;
        this.orientation_du_corps = orientation_du_corps;
        this.jonglage = jonglage;
        this.conduite_de_balle = conduite_de_balle;
        this.dribbles_et_feintes = dribbles_et_feintes;
        this.protection_de_ballon = protection_de_ballon;
        this.premiere_touche = premiere_touche;
        this.controles_orientes = controles_orientes;
        this.controles_aeriens = controles_aeriens;
        this.passes_courtes = passes_courtes;
        this.passes_moyennes = passes_moyennes;
        this.passes_longues = passes_longues;
        this.centres = centres;
        this.volee = volee;
        this.tirs = tirs;
        this.jeu_de_tete = jeu_de_tete;
        this.pied_faible = pied_faible;
        this.x_1_vs_1 = x_1_vs_1;
        this.vision_de_jeu = vision_de_jeu;
        this.creativite_et_prise_d_initiatives = creativite_et_prise_d_initiatives;
        this.placement = placement;
        this.deplacement = deplacement;
        this.attitude_a_la_perte_de_balle = attitude_a_la_perte_de_balle;
        this.mise_en_pratique_des_principes_de_zone = mise_en_pratique_des_principes_de_zone;
        this.anticipation = anticipation;
        this.replacement = replacement;
        this.motricite = motricite;
        this.vivacite = vivacite;
        this.vitesse = vitesse;
        this.endurance = endurance;
        this.puissance = puissance;
        this.souplesse = souplesse;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getId_player() {
        return id_player;
    }

    public void setId_player(int id_player) {
        this.id_player = id_player;
    }

    public float getConfiance_en_soi() {
        return confiance_en_soi;
    }

    public void setConfiance_en_soi(float confiance_en_soi) {
        this.confiance_en_soi = confiance_en_soi;
    }

    public float getGout_de_l_effort() {
        return gout_de_l_effort;
    }

    public void setGout_de_l_effort(float gout_de_l_effort) {
        this.gout_de_l_effort = gout_de_l_effort;
    }

    public float getConcentration() {
        return concentration;
    }

    public void setConcentration(float concentration) {
        this.concentration = concentration;
    }

    public float getApplication() {
        return application;
    }

    public void setApplication(float application) {
        this.application = application;
    }

    public float getJoueur_equipier() {
        return joueur_equipier;
    }

    public void setJoueur_equipier(float joueur_equipier) {
        this.joueur_equipier = joueur_equipier;
    }

    public float getOrientation_du_corps() {
        return orientation_du_corps;
    }

    public void setOrientation_du_corps(float orientation_du_corps) {
        this.orientation_du_corps = orientation_du_corps;
    }

    public float getJonglage() {
        return jonglage;
    }

    public void setJonglage(float jonglage) {
        this.jonglage = jonglage;
    }

    public float getConduite_de_balle() {
        return conduite_de_balle;
    }

    public void setConduite_de_balle(float conduite_de_balle) {
        this.conduite_de_balle = conduite_de_balle;
    }

    public float getDribbles_et_feintes() {
        return dribbles_et_feintes;
    }

    public void setDribbles_et_feintes(float dribbles_et_feintes) {
        this.dribbles_et_feintes = dribbles_et_feintes;
    }

    public float getProtection_de_ballon() {
        return protection_de_ballon;
    }

    public void setProtection_de_ballon(float protection_de_ballon) {
        this.protection_de_ballon = protection_de_ballon;
    }

    public float getPremiere_touche() {
        return premiere_touche;
    }

    public void setPremiere_touche(float premiere_touche) {
        this.premiere_touche = premiere_touche;
    }

    public float getControles_orientes() {
        return controles_orientes;
    }

    public void setControles_orientes(float controles_orientes) {
        this.controles_orientes = controles_orientes;
    }

    public float getControles_aeriens() {
        return controles_aeriens;
    }

    public void setControles_aeriens(float controles_aeriens) {
        this.controles_aeriens = controles_aeriens;
    }

    public float getPasses_courtes() {
        return passes_courtes;
    }

    public void setPasses_courtes(float passes_courtes) {
        this.passes_courtes = passes_courtes;
    }

    public float getPasses_moyennes() {
        return passes_moyennes;
    }

    public void setPasses_moyennes(float passes_moyennes) {
        this.passes_moyennes = passes_moyennes;
    }

    public float getPasses_longues() {
        return passes_longues;
    }

    public void setPasses_longues(float passes_longues) {
        this.passes_longues = passes_longues;
    }

    public float getCentres() {
        return centres;
    }

    public void setCentres(float centres) {
        this.centres = centres;
    }

    public float getVolee() {
        return volee;
    }

    public void setVolee(float volee) {
        this.volee = volee;
    }

    public float getTirs() {
        return tirs;
    }

    public void setTirs(float tirs) {
        this.tirs = tirs;
    }

    public float getJeu_de_tete() {
        return jeu_de_tete;
    }

    public void setJeu_de_tete(float jeu_de_tete) {
        this.jeu_de_tete = jeu_de_tete;
    }

    public float getPied_faible() {
        return pied_faible;
    }

    public void setPied_faible(float pied_faible) {
        this.pied_faible = pied_faible;
    }

    public float getX_1_vs_1() {
        return x_1_vs_1;
    }

    public void setX_1_vs_1(float x_1_vs_1) {
        this.x_1_vs_1 = x_1_vs_1;
    }

    public float getVision_de_jeu() {
        return vision_de_jeu;
    }

    public void setVision_de_jeu(float vision_de_jeu) {
        this.vision_de_jeu = vision_de_jeu;
    }

    public float getCreativite_et_prise_d_initiatives() {
        return creativite_et_prise_d_initiatives;
    }

    public void setCreativite_et_prise_d_initiatives(float creativite_et_prise_d_initiatives) {
        this.creativite_et_prise_d_initiatives = creativite_et_prise_d_initiatives;
    }

    public float getPlacement() {
        return placement;
    }

    public void setPlacement(float placement) {
        this.placement = placement;
    }

    public float getDeplacement() {
        return deplacement;
    }

    public void setDeplacement(float deplacement) {
        this.deplacement = deplacement;
    }

    public float getAttitude_a_la_perte_de_balle() {
        return attitude_a_la_perte_de_balle;
    }

    public void setAttitude_a_la_perte_de_balle(float attitude_a_la_perte_de_balle) {
        this.attitude_a_la_perte_de_balle = attitude_a_la_perte_de_balle;
    }

    public float getMise_en_pratique_des_principes_de_zone() {
        return mise_en_pratique_des_principes_de_zone;
    }

    public void setMise_en_pratique_des_principes_de_zone(float mise_en_pratique_des_principes_de_zone) {
        this.mise_en_pratique_des_principes_de_zone = mise_en_pratique_des_principes_de_zone;
    }

    public float getAnticipation() {
        return anticipation;
    }

    public void setAnticipation(float anticipation) {
        this.anticipation = anticipation;
    }

    public float getReplacement() {
        return replacement;
    }

    public void setReplacement(float replacement) {
        this.replacement = replacement;
    }

    public float getMotricite() {
        return motricite;
    }

    public void setMotricite(float motricite) {
        this.motricite = motricite;
    }

    public float getVivacite() {
        return vivacite;
    }

    public void setVivacite(float vivacite) {
        this.vivacite = vivacite;
    }

    public float getVitesse() {
        return vitesse;
    }

    public void setVitesse(float vitesse) {
        this.vitesse = vitesse;
    }

    public float getEndurance() {
        return endurance;
    }

    public void setEndurance(float endurance) {
        this.endurance = endurance;
    }

    public float getPuissance() {
        return puissance;
    }

    public void setPuissance(float puissance) {
        this.puissance = puissance;
    }

    public float getSouplesse() {
        return souplesse;
    }

    public void setSouplesse(float souplesse) {
        this.souplesse = souplesse;
    }


    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", date=" + date +
                ", id_player=" + id_player +
                ", comment='" + comment + '\'' +
                ", confiance_en_soi=" + confiance_en_soi +
                ", gout_de_l_effort=" + gout_de_l_effort +
                ", concentration=" + concentration +
                ", application=" + application +
                ", joueur_equipier=" + joueur_equipier +
                ", orientation_du_corps=" + orientation_du_corps +
                ", jonglage=" + jonglage +
                ", conduite_de_balle=" + conduite_de_balle +
                ", dribbles_et_feintes=" + dribbles_et_feintes +
                ", protection_de_ballon=" + protection_de_ballon +
                ", premiere_touche=" + premiere_touche +
                ", controles_orientes=" + controles_orientes +
                ", controles_aeriens=" + controles_aeriens +
                ", passes_courtes=" + passes_courtes +
                ", passes_moyennes=" + passes_moyennes +
                ", passes_longues=" + passes_longues +
                ", centres=" + centres +
                ", volee=" + volee +
                ", tirs=" + tirs +
                ", jeu_de_tete=" + jeu_de_tete +
                ", pied_faible=" + pied_faible +
                ", x_1_vs_1=" + x_1_vs_1 +
                ", vision_de_jeu=" + vision_de_jeu +
                ", creativite_et_prise_d_initiatives=" + creativite_et_prise_d_initiatives +
                ", placement=" + placement +
                ", deplacement=" + deplacement +
                ", attitude_a_la_perte_de_balle=" + attitude_a_la_perte_de_balle +
                ", mise_en_pratique_des_principes_de_zone=" + mise_en_pratique_des_principes_de_zone +
                ", anticipation=" + anticipation +
                ", replacement=" + replacement +
                ", motricite=" + motricite +
                ", vivacite=" + vivacite +
                ", vitesse=" + vitesse +
                ", endurance=" + endurance +
                ", puissance=" + puissance +
                ", souplesse=" + souplesse +
                '}';
    }
}
