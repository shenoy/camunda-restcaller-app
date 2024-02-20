import java.text.SimpleDateFormat

def currentTime = new Date()
def dateFormat = new SimpleDateFormat("HH:mm:ss")
def formattedTime = dateFormat.format(currentTime)

println "Current Time: ${formattedTime}"
