public class GlobalStreamingGateway{
    public static void main(String[] args) {

        String userName = "Jeferson Torres";
        String planType = "PREMIUM";
        int internetSpeed = 30;
        boolean isMobileDevice = false;

        String deliveryQuality;
        int maxAllowedResolution = 480;

        switch (planType){
            case "PREMIUM":
                maxAllowedResolution = 2160;
                break;
            case "STANDARD":
                maxAllowedResolution = 1080;
                break;
            case "BASIC":
                maxAllowedResolution = 480;
                break;
            default:
                maxAllowedResolution = 480;
                break;
        }

        if (internetSpeed < 5.0){
            deliveryQuality = "Conexão está ruim, entregue 480p";
            System.out.println("Ta funcionando ");
        } else if (internetSpeed >= 25) {
            deliveryQuality = maxAllowedResolution + "p";
        } else if (isMobileDevice == true) {
            deliveryQuality = "Entregue 720p, modo otimizado";
        }else {
            deliveryQuality = "STREAMING_WITH_BUFFER_RISK";
        }

        System.out.printf("""
                === GLOBAL STREAMING GATEWAY ===
                User: %s
                Plan Type: %s
                Mobile Device: %b
                
                Network Details:
                -> Current Speed: %d Mbps
                -> Plan Max Resolution: %dp
                
                System Decision:
                -> Delivery Quality: %s
                ================================
                """, userName, planType,isMobileDevice,internetSpeed, maxAllowedResolution, deliveryQuality);

    }
}
