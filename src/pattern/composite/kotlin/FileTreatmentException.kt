package pattern.composite.kotlin


class FileTreatmentException : RuntimeException {
    constructor() {}

    constructor(msg: String): super(msg){}
}

