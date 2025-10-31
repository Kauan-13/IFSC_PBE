package ads.pbe.grpc;

import io.grpc.stub.StreamObserver;
import org.pbe.demo.CalcGrpc;
import org.pbe.demo.CalculadoraRequest;
import org.pbe.demo.CalculadoraResponse;
import org.springframework.grpc.server.service.GrpcService;

@GrpcService
public class CalculadoraService extends CalcGrpc.CalcImplBase {
    @Override
    public void soma(CalculadoraRequest request, StreamObserver<CalculadoraResponse> responseObserver) {
        double n1 =  request.getN1();
        double n2 = request.getN2();

        double result = n1+n2;
        CalculadoraResponse response = CalculadoraResponse.newBuilder().setResultado(result).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void subtracao(CalculadoraRequest request, StreamObserver<CalculadoraResponse> responseObserver) {
        double n1 =  request.getN1();
        double n2 = request.getN2();

        double result = n1-n2;
        CalculadoraResponse response = CalculadoraResponse.newBuilder().setResultado(result).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void multiplicacao(CalculadoraRequest request, StreamObserver<CalculadoraResponse> responseObserver) {
        double n1 =  request.getN1();
        double n2 = request.getN2();

        double result = n1*n2;
        CalculadoraResponse response = CalculadoraResponse.newBuilder().setResultado(result).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void divisao(CalculadoraRequest request, StreamObserver<CalculadoraResponse> responseObserver) {
        double n1 =  request.getN1();
        double n2 = request.getN2();

        double result = n1/n2;
        CalculadoraResponse response = CalculadoraResponse.newBuilder().setResultado(result).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}