import java.text.SimpleDateFormat

def currentTime = new Date()
def dateFormat = new SimpleDateFormat("HH:mm:ss")
def formattedTime = dateFormat.format(currentTime)

println "Calling Camunda 7 Quiz .....Current Time: ${formattedTime}"
