/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tonikelope.megabasterd;

import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tonikelope
 */
public final class LabelTranslatorSingleton {

    public static LabelTranslatorSingleton getInstance() {

        return LabelTranslatorSingleton.LazyHolder.INSTANCE;
    }

    private final ConcurrentHashMap<String, String> _rosetta;

    private LabelTranslatorSingleton() {

        _rosetta = new ConcurrentHashMap();

        switch (MainPanel.getLanguage()) {

            case "ES":
                Spanish();
        }

    }

    private final static class LazyHolder {

        private static final LabelTranslatorSingleton INSTANCE = new LabelTranslatorSingleton();
    }

    private void Spanish() {

        _addTranslation("FATAL ERROR! ", "¡ERROR FATAL! ");
        _addTranslation("Mega link is not valid! ", "Enlace de MEGA incorrecto! ");
        _addTranslation("Checking your MEGA accounts, please wait...", "Comprobando tus cuentas de MEGA, por favor espera...");
        _addTranslation("Check version", "Comprobar versión");
        _addTranslation("Checking, please wait...", "Comprobando, por favor espera...");
        _addTranslation("You have the latest version ;)", "Tienes la versión más reciente ;)");
        _addTranslation("Copy MegaBasterd download URL", "Copiar la URL de descarga de MegaBasterd");
        _addTranslation("Made with love (and with no warranty) by tonikelope.", "Fabricado con amor (y sin ninguna garantía) por tonikelope.");
        _addTranslation("Yet another (unofficial) cross-platform MEGA downloader/uploader/streaming suite.", "Ni más ni menos que otra suite multiplataforma (no oficial) de descarga/subida/streaming para MEGA.");
        _addTranslation("MEGA URL was copied to clipboard!", "¡URL de MEGA copiada en el portapapeles!");
        _addTranslation("MegaBasterd NEW VERSION is available! -> ", "¡Hay una versión nueva de MegaBasterd disponible! -> ");
        _addTranslation("Selecting folder...", "Seleccionando carpeta...");
        _addTranslation("MERGE FILE", "JUNTAR ARCHIVO");
        _addTranslation("Delete parts after merge", "Eliminar partes después de juntar");
        _addTranslation("Remove selected", "Quitar seleccionado");
        _addTranslation("SPLIT FILE", "PARTIR ARCHIVO");
        _addTranslation("Encrypt on disk sensitive information", "Cifrar en disco datos sensibles");
        _addTranslation("Use MEGA accounts for download/stream", "Utilizar cuentas de MEGA para descargar/subir");
        _addTranslation("Please wait...", "Por favor espera...");
        _addTranslation("CANCEL RETRY", "CANCELAR REINTENTO");
        _addTranslation("SPLITTING FILE...", "PARTIENDO ARCHIVO...");
        _addTranslation("Open folder", "Abrir carpeta");
        _addTranslation("RESUME DOWNLOAD", "CONTINUAR DESCARGA");
        _addTranslation("Close", "Cerrar");
        _addTranslation("Add files", "Agregar archivos");
        _addTranslation("IMPORT SETTINGS", "IMPORTAR AJUSTES");
        _addTranslation("RESET MEGABASTERD", "RESETEAR MEGABASTERD");
        _addTranslation("RESET ACCOUNTS", "RESETEAR CUENTAS");
        _addTranslation("Verify file integrity (when download is finished)", "Verificar integridad del archivo (al terminar la descarga)");
        _addTranslation("Let's dance, baby", "¡Vamos!");
        _addTranslation("Unlock accounts", "Desbloquear cuentas");
        _addTranslation("Use MegaCrypter reverse mode", "Utilizar modo inverso de MegaCrypter");
        _addTranslation("Select (any) file part", "Seleccionar (alguna) parte del archivo");
        _addTranslation("Add folder", "Añadir una carpeta");
        _addTranslation("Adding files, please wait...", "Añadiendo archivos, por favor espera...");
        _addTranslation("Restart", "Reiniciar");
        _addTranslation("Use SmartProxy", "Utilizar SmartProxy");
        _addTranslation("PAUSE DOWNLOAD", "PAUSAR DESCARGA");
        _addTranslation("Change it", "Cambiar");
        _addTranslation("EXPORT SETTINGS", "EXPORTAR AJUSTES");
        _addTranslation("Change output folder", "Cambiar carpeta destino");
        _addTranslation("Add account", "Añadir cuenta");
        _addTranslation("Select file", "Seleccionar archivo");
        _addTranslation("Opening file...", "Abriendo archivo...");
        _addTranslation("CANCEL DOWNLOAD", "CANCELAR DESCARGA");
        _addTranslation("REMOVE ALL EXCEPT THIS", "QUITAR TODO EXCEPTO ESTO");
        _addTranslation("Loading DLC, please wait...", "Cargando DLC, por favor espera...");
        _addTranslation("Changing output folder...", "Cambiando carpeta destino...");
        _addTranslation("RESUME UPLOAD", "CONTINUAR SUBIDA");
        _addTranslation("Limit upload speed", "Limitar velocidad de subida");
        _addTranslation("CANCEL", "CANCELAR");
        _addTranslation("Use multi slot download mode", "Utilizar descarga multi slot");
        _addTranslation("Selecting file...", "Seleccionando archivo...");
        _addTranslation("Copy folder link", "Copiar enlace de carpeta");
        _addTranslation("Limit download speed", "Limitar velocidad de descarga");
        _addTranslation("REMOVE THIS", "QUITAR ESTO");
        _addTranslation("Copy file link", "Copiar enlace de archivo");
        _addTranslation("Load DLC container", "Cargar contenedor DLC");
        _addTranslation("Adding folder, please wait...", "Añadiendo carpeta, por favor espera...");
        _addTranslation("PAUSE UPLOAD", "PAUSAR SUBIDA");
        _addTranslation("CANCEL CHECK", "CANCELAR VERIFICACIÓN");
        _addTranslation("Keep temp file", "Conservar archivo temporal");
        _addTranslation("Use HTTP(S) PROXY", "Utilizar PROXY HTTP(S)");
        _addTranslation("MERGING FILE...", "JUNTANDO ARCHIVO...");
        _addTranslation("Checking MEGA account...", "Comprobando cuenta de MEGA...");
        _addTranslation("SAVE", "GUARDAR");
        _addTranslation("New download", "Nueva descarga");
        _addTranslation("New upload", "Nueva subida");
        _addTranslation("New stream", "Nuevo stream");
        _addTranslation("Split file", "Partir un archivo");
        _addTranslation("Merge file", "Juntar las partes de un archivo");
        _addTranslation("Remove all no running downloads", "Cancelar las descargas en espera");
        _addTranslation("Remove all no running uploads", "Cancelar las subidas en espera");
        _addTranslation("Edit", "Edición");
        _addTranslation("Settings", "Ajustes");
        _addTranslation("Help", "Ayuda");
        _addTranslation("About", "Acerca de");
        _addTranslation("Remember for this session", "Recordar durante la sesión");
        _addTranslation("Restore folder data", "Restaurar contenido de la carpeta");
        _addTranslation("Restoring data, please wait...", "Restaurando datos, por favor espera...");
        _addTranslation("File", "Archivo");
        _addTranslation("Hide to tray", "Ocultar en la bandeja");
        _addTranslation("Close all OK finished", "Cerrar las que finalizaron OK");
        _addTranslation("Exit", "Salir");
        _addTranslation("Default slots per file:", "Slots por archivo por defecto:");
        _addTranslation("Note: if you want to download without using a MEGA PREMIUM account you SHOULD enable it. (Slots consume RAM, so use them moderately).", "Nota: si quieres descargar sin utilizar una cuenta de MEGA PREMIUM es recomendable activarlo. (Los slots consumen RAM, así que úsalos con moderación).");
        _addTranslation("Max speed (KB/s):", "Velocidad máxima (KB/s):");
        _addTranslation("Default account:", "Cuenta por defecto:");
        _addTranslation("TCP Port:", "Puerto TCP:");
        _addTranslation("Note: you MUST \"OPEN\" this port in your router/firewall.", "Nota: es OBLIGATORIO \"ABRIR\" este puerto en tu router/firewall.");
        _addTranslation("Note: enable it in order to mitigate bandwidth limit. (Multi slot required).", "Nota: actívalo para mitigar el límite de descarga de MEGA.");
        _addTranslation("Max parallel downloads:", "Máximas descargas simultáneas:");
        _addTranslation("Max parallel uploads:", "Máximas subidas simultáneas:");
        _addTranslation("Note: slots consume RAM, so use them moderately.", "Nota: los slots consumen RAM, así que úsalos con moderación");
        _addTranslation("Note: you can use a (optional) alias for your email addresses -> bob@supermail.com#bob_mail (don't forget to save after entering your accounts).", "Nota: puedes usar de forma opcional un alias para tus emails -> bob@supermail.com#bob_mail (no te olvides de guardar después de introducir todas tus cuentas).");
        _addTranslation("Your MEGA accounts:", "Tus cuentas de MEGA:");
        _addTranslation("Your ELC accounts:", "Tus cuentas ELC:");
        _addTranslation("Note: restart required.", "Nota: es necesario reiniciar.");
        _addTranslation("Note: restart might be required.", "Nota: podría ser necesario reiniciar.");
        _addTranslation("Font ZOOM (%):", "Zoom de la fuente (%):");
        _addTranslation("Note: MegaBasterd will use this proxy for ALL connections (restart required).", "Nota: MegaBasterd utilizará este proxy para todas las conexiones (es necesario reiniciar).");
        _addTranslation("Port:", "Puerto:");
        _addTranslation("Settings successfully saved!", "¡Ajustes guardados correctamente!");
        _addTranslation("Settings successfully imported!", "¡Ajustes importados correctamente!");
        _addTranslation("Settings successfully exported!", "¡Ajustes exportados correctamente!");
        _addTranslation("Settings successfully reset!", "¡Ajustes reseteados correctamente!");
        _addTranslation("There were errors with some accounts (email and/or password are/is wrong). Please, check them:\n\n", "Hay errores con algunas cuentas (email y/o contraseña incorrectos). Por favor, revísalas:\n\n");
        _addTranslation("Settings saved", "Ajustes guardados");
        _addTranslation("Settings imported", "Ajustes importados");
        _addTranslation("Settings exported", "Ajustes exportados");
        _addTranslation("Settings reset", "Ajustes reseteados");
        _addTranslation("MegaBasterd will restart", "MegaBasterd se reiniciará");
        _addTranslation("Restart required", "Es necesario reiniciar");
        _addTranslation("File is not readable!", "¡Archivo no accesible!");
        _addTranslation("Folder is not readable!", "¡Carpeta no accesible!");
        _addTranslation("BAD PASSWORD!", "¡CONTRASEÑA INCORRECTA!");
        _addTranslation("Passwords does not match!", "¡Las contraseñas no coinciden!");
        _addTranslation("Please, paste a Mega/MegaCrypter/ELC link!", "Por favor, escribe un enlace de Mega/MegaCrypter/ELC");
        _addTranslation("Yes", "Sí");
        _addTranslation("Cancel", "Cancelar");
        _addTranslation("It seems MegaBasterd is streaming video. Do you want to exit?", "Parece que MegaBasterd está retransmitiendo vídeo. ¿Quieres continuar?");
        _addTranslation("It seems MegaBasterd is provisioning down/uploads.\n\nIf you exit now, unprovisioned down/uploads will be lost.\n\nDo you want to continue?", "Parece que MegaBasterd está provisionando transferencias.\n\nSi sales ahora, todas las transferencias no provisionadas se perderán.\n\n¿Quieres continuar?");
        _addTranslation("It seems MegaBasterd is just finishing uploading some files.\n\nIF YOU EXIT NOW, THOSE UPLOADS WILL FAIL.\n\nDo you want to continue?", "Parece que MegaBasterd está finalizando unas subidas.\n\nSI SALES AHORA, ESAS SUBIDAS FALLARÁN.\n\n¿Quieres continuar?");
        _addTranslation("All your current settings and accounts will be deleted after import. (It is recommended to export your current settings before importing). \n\nDo you want to continue?", "Todos tus ajustes y cuentas actuales se perderán después de importar. (Es recomendable guardar tus ajustes actuales antes de importar otros). ¿Quieres continuar?");
        _addTranslation("Only SAVED settings and accounts will be exported. (If you are unsure, it is better to save your current settings and then export them).\n\nDo you want to continue?", "Sólamente los ajustes GUARDADOS se exportarán. (Si no estás seguro, es mejor que guardes antes tus ajustes y que después vuelvas aquí). ¿Quieres continuar?");
        _addTranslation("Master password will be reset and all your accounts will be removed. (THIS CAN'T BE UNDONE)\n\nDo you want to continue?", "La contraseña maestra será reseteada y todas tus cuentas serán eliminadas. (ESTO NO SE PUEDE DESHACER).\n\n¿Quieres continuar?");
        _addTranslation("ALL YOUR SETTINGS, ACCOUNTS AND TRANSFERENCES WILL BE REMOVED. (THIS CAN'T BE UNDONE)\n\nDo you want to continue?", "TODOS TUS AJUSTES, CUENTAS Y TRANSFERENCIAS SERÁN ELIMINADAS. (ESTO NO SE PUEDE DESHACER)\n\n¿Quieres continuar?");
        _addTranslation("Remove all preprocessing, provisioning and waiting downloads?", "¿Eliminar todas las descargas que no están en ejecución?");
        _addTranslation("Warning!", "¡Atención!");
        _addTranslation("Remove all preprocessing, provisioning and waiting uploads?", "¿Eliminar todas las subidas que no están en ejecución?");
        _addTranslation("Please, enter your master password", "Por favor, ingresa tu contraseña maestra");
        _addTranslation("WARNING: if you forget this password, you will have to insert all your accounts again.", "AVISO: si olvidas esta contraseña, tendrás que volver a insertar todas tus cuentas.");
        _addTranslation("New pass:", "Nueva contraseña:");
        _addTranslation("Confirm new:", "Confirmar nueva contraseña:");
        _addTranslation("Verifying your password, please wait...", "Verificando tu contraseña, por favor espera...");
        _addTranslation("Processing your password, please wait...", "Procesando tu contraseña, por favor espera...");
        _addTranslation("Downloads", "Descargas");
        _addTranslation("Uploads", "Subidas");
        _addTranslation("Accounts", "Cuentas");
        _addTranslation("Advanced", "Avanzado");
        _addTranslation("Language:", "Idioma:");
        _addTranslation("English", "Inglés");
        _addTranslation("Spanish", "Español");
        _addTranslation("Checking account quota, please wait...", "Comprobando espacio utilizado de la cuenta, por favor espera...");
        _addTranslation("ERROR checking account quota!", "ERROR al comprobar el espacio utilizado.");
        _addTranslation("If you DO NOT want to upload some folder or file you can REMOVE it (to select several items at the same time use CTRL + LMOUSE).", "Si no quieres subir alguna carpeta o archivo puedes quitarlo de la lista (para seleccionar varios elementos al mismo tiempo usa CTRL + RATÓN_IZQ)");
        _addTranslation("Upload name:", "Nombre de la subida:");
        _addTranslation("Account:", "Cuenta:");
        _addTranslation("Folder link detected!", "¡Enlace de carpeta detectado!");
        _addTranslation("File already exists!", "¡El archivo ya existe!");
        _addTranslation("Megabasterd is stopping transferences safely, please wait...", "MegaBasterd está deteniendo las transferencias de forma segura, por favor espera...");
        _addTranslation("Put your MEGA/MegaCrypter/ELC link/s here (one per line):", "Pon aquí tus enlaces de MEGA/MegaCrypter/ELC (uno por línea):");
        _addTranslation("Download folder:", "Carpeta de descarga:");
        _addTranslation("Split size (MBs):", "Tamaño de cada parte (MBs):");
        _addTranslation("File successfully splitted!", "¡Archivo partido correctamente!");
        _addTranslation("File successfully merged!", "¡Archivo juntado correctamente!");
        _addTranslation("File successfuly downloaded!", "¡Archivo descargado correctamente!");
        _addTranslation("Download paused!", "¡Descarga pausada!");
        _addTranslation("Downloading file from mega ...", "Descargando archivo de mega ...");
        _addTranslation("Copy link", "Copiar enlace");
        _addTranslation("Downloading file from mega ", "Descargando archivo de mega ");
        _addTranslation("EXIT NOW", "SALIR AHORA MISMO");
        _addTranslation("Download CANCELED!", "¡Descarga CANCELADA!");
        _addTranslation("Upload CANCELED!", "¡Subida CANCELADA!");
        _addTranslation("Uploading file to mega (", "Subiendo archivo a mega (");
        _addTranslation("Put your MEGA/MegaCrypter/ELC link here in order to get a streaming link:", "Pon aquí tu enlace de MEGA/MegaCrypter/ELC para conseguir un enlace de streaming:");
        _addTranslation("Use this account for streaming:", "Usar esta cuenta para streaming:");
        _addTranslation("Use this account for download:", "Usar esta cuenta para descargar:");
        _addTranslation("Streaming link was copied to clipboard!\nRemember to keep MegaBasterd running in background while playing content.", "¡Enlace de streaming copiado al portapapeles!\nRecuerda dejar abierto MegaBasterd mientras se reproduce el contenido.");
        _addTranslation("CANCEL UPLOAD", "CANCELAR SUBIDA");
        _addTranslation("Upload paused!", "¡Subida pausada!");
        _addTranslation("Stopping download safely before exit MegaBasterd, please wait...", "Deteniendo descarga de forma segura antes de salir, por favor espera...");
        _addTranslation("Stopping upload safely before exit MegaBasterd, please wait...", "Deteniendo subida de forma segura antes de salir, por favor espera...");
        _addTranslation("Starting download, please wait...", "Empezando descarga, por favor espera...");
        _addTranslation("Starting upload, please wait...", "Empezando subida, por favor espera...");
        _addTranslation("Starting download (retrieving MEGA temp link), please wait...", "Empezando descarga (pidiendo enlace temporal de MEGA), por favor espera...");
        _addTranslation("File exists, resuming download...", "El archivo existe, continuando descarga...");
        _addTranslation("Truncating temp file...", "Truncando fichero temporal...");
        _addTranslation("Waiting to check file integrity...", "Esperando para verificar integridad del archivo...");
        _addTranslation("Checking file integrity, please wait...", "Verificando integridad del archivo...");
        _addTranslation("Provisioning download, please wait...", "Aprovisionando descarga, por favor espera...");
        _addTranslation("Waiting to start...", "Esperando para empezar...");
        _addTranslation("Provisioning upload, please wait...", "Aprovisionando subida, por favor espera...");
        _addTranslation("Waiting to start (", "Esperando para empezar (");
        _addTranslation("Creating new MEGA node ... ***DO NOT EXIT MEGABASTERD NOW***", "Creando nuevo nodo de MEGA ... ***NO CIERRES MEGABASTERD EN ESTE MOMENTO***");
        _addTranslation("File successfully uploaded! (", "¡Archivo subido correctamente! (");
        _addTranslation("PAUSE ALL", "PAUSAR TODO");
        _addTranslation("MEGA folder link was copied to clipboard!", "¡Enlace de carpeta de MEGA copiado al portapapeles!");
        _addTranslation("MEGA file link was copied to clipboard!", "¡Enlace de fichero de MEGA copiado al portapapeles!");
        _addTranslation("Pausing download ...", "Pausando descarga ...");
        _addTranslation("Pausing upload ...", "Pausando subida ...");
        _addTranslation("File successfully downloaded! (Integrity check PASSED)", "¡Archivo descargado correctamente! (Test de integridad CORRECTO)");
        _addTranslation("File successfully downloaded! (but integrity check CANCELED)", "¡Archivo descargado correctamente! (Test de integridad cancelado)");
        _addTranslation("UPLOAD FAILED! (Empty completion handle!)", "¡SUBIDA FALLIDA! (Completion handle vacío)");
        _addTranslation("BAD NEWS :( File is DAMAGED!", "MALAS NOTICIAS :( El archivo está corrupto!");
        _addTranslation("File temporarily unavailable! (Retrying in ", "¡Archivo temporalmente no disponible! (Reintentando en ");
        _addTranslation(" secs...)", " segundos...)");
        _addTranslation(" (Retrying in ", " (Reintentando en ");
        _addTranslation("Proxy settings", "Ajustes de proxy");
        _addTranslation("Authentication", "Autenticación");
        _addTranslation("Upload info", "Información de la subida");
        _addTranslation("Files", "Archivos");
        _addTranslation("Username:", "Usuario:");
        _addTranslation("Password:", "Contraseña:");
        _addTranslation("Link was copied to clipboard!", "¡Enlace copiado al portapapeles!");
        _addTranslation("Checking if there are previous downloads, please wait...", "Comprobando si existen descargas previas, por favor espera...");
        _addTranslation("Checking if there are previous uploads, please wait...", "Comprobando si existen subidas previas, por favor espera...");
        _addTranslation("Restore window", "Restaurar ventana");
        _addTranslation("EXIT", "SALIR");
        _addTranslation("File successfully downloaded!", "¡Archivo descargado correctamente!");
        _addTranslation("Quota used: ", "Espacio usado: ");
        _addTranslation("Streaming server: ON (port ", "Servidor de streaming: ON (puerto ");
        _addTranslation("MC reverse mode: ON (port ", "MC reverse mode: ON (puerto ");

    }

    private void _addTranslation(String key, String val) {

        if (_rosetta.putIfAbsent(key, val) != null) {

            Logger.getLogger(MainPanel.class.getName()).log(Level.WARNING, "Rosetta: {0} aready exists!", new Object[]{key});
        }
    }

    public String translate(String orig) {

        return _rosetta.containsKey(orig) ? (String) _rosetta.get(orig) : orig;
    }
}