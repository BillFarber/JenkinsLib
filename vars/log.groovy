def info(message) {
    echo "INFO: ${message}"
}

def warning(message) {
    echo "WARNING: ${message}"
}

def copyRPM(type, version) {
    echo "Should be downloading the RPM for: ${type}, ${version}"
}