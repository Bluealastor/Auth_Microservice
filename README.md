# Microservizio di Autenticazione

Questo microservizio è progettato per gestire l'autenticazione degli utenti in una qualsiasi applicazione.
Utilizza:
+ **Spring WebFlux** per una gestione reattiva delle richieste tra microservizi.
+ **OAuth2** per l'autenticazione.
+ **JWT** (JSON Web Tokens) per la gestione dei token di sessione.
+ **Lombok** per semplificare il codice Java.

## Tecnologie Utilizzate
- **Spring WebFlux** - Framework reattivo per la gestione delle richieste HTTP.
- **OAuth2** - Protocollo di autorizzazione per la gestione sicura delle credenziali utente.
- **JWT** - JSON Web Token per la gestione dei token di autenticazione.
- **Lombok** - Per ridurre il boilerplate nel codice Java.
- **Docker** - Per la containerizzazione del microservizio.
- **PostgreSQL** - Per la gestione dei dati.

## Requisiti

Per eseguire il microservizio, assicurati di avere:

- [Java 24](https://adoptopenjdk.net/)
- [Maven](https://maven.apache.org/)
- [Docker](https://www.docker.com/get-started)

## Setup

### Clona il Repository

```bash
git clone https://github.com/tuo-username/microservizio-auth.git
cd microservizio-auth
