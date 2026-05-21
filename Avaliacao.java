void main() {
    int totalPieces = 0;
    int batchesAnalyzed = 0;

    while (true) {
        int quantityPieces = Integer.parseInt(IO.readln("Insira a quantidade de peças defeituosas: "));
        if (quantityPieces < 0) {
            if (batchesAnalyzed == 0) {
                IO.println("A quantidade de peças no primeiro lote deve ser maior que zero");
            } else {
                break;
            }
        } else {
            totalPieces += quantityPieces;
            batchesAnalyzed++;
        }
    }

    double average = totalPieces / batchesAnalyzed;

    if (average <= 2) {
        IO.println("Máquina Regulada (Excelente)");
    } else if (average > 2.1 && average < 5) {
        IO.println("Alerta! Necessita de Manutenção Preventiva");
    } else if (average > 5) {
        IO.println("Paragem Crítica: Máquina Danificada");
    }
}
