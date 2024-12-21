class copyRPM {
    def call(String type, String version, closure) {
        closure("Mocking: ${type}:${version}")
    }
}
