# Application de Gestion de Rendez-vous

## Description

L'application de gestion de rendez-vous est une plateforme web permettant aux professionnels (médecins, avocats, consultants, etc.) de gérer leurs rendez-vous avec leurs clients. Les clients peuvent prendre des rendez-vous en ligne, tandis que les professionnels peuvent gérer leur emploi du temps et recevoir des notifications de rappel.

## Fonctionnalités

- **Authentification des utilisateurs** :
  - Inscription et connexion des clients et des professionnels.
  - Gestion des mots de passe (réinitialisation et modification).
  - Authentification sécurisée avec Spring Security.

- **Prise de rendez-vous** :
  - Sélection de la date et de l'heure pour prendre un rendez-vous.
  - Affichage des créneaux horaires disponibles.

- **Gestion des horaires disponibles** :
  - Définition des jours et heures disponibles pour les professionnels.
  - Gestion des pauses et des jours non disponibles.

- **Notifications de rappel** :
  - Envoi automatique d'e-mails et de SMS pour rappeler les rendez-vous.

- **Interface de gestion des rendez-vous** :
  - Visualisation et gestion des rendez-vous pour les professionnels.
  - Option pour annuler ou reprogrammer les rendez-vous.

## Technologies

- **Backend** : Java Spring Boot avec Spring Security
- **Frontend** : React

### Dépendances Backend

- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- Spring Boot Starter Security
- Spring Boot Starter Mail
- Lombok
- JWT (JSON Web Token)
- MySQL Driver (pour la connexion à la base de données MySQL)


